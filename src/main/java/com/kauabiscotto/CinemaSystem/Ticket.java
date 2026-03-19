package com.kauabiscotto.CinemaSystem;

public class Ticket {

    private Session session;
    private String seat;
    private double finalPrice;


    public Ticket(Session session, String seat, boolean halfPriceTicket) {
        this.session = session;
        this.seat = seat;
        double basePrice = session.getPrice();
        if (halfPriceTicket) {
            this.finalPrice = basePrice / 2;
        } else {
            this.finalPrice = basePrice;
        }

        session.reservarAssento(seat);
    }

    public Session getSession() {
        return session;
    }

    public String getSeat() {
        return seat;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    @Override
    public String toString() {
        return "Ticket: Movie " + session.getMovie().getTitle() +
                " | Room " + session.getCinemaRoom() +
                " | Hour " + session.getSchedule() +
                " | Seat " + seat +
                " | Price R$" + finalPrice;
    }

}
