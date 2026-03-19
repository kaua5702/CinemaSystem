package com.kauabiscotto.CinemaSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Session {

    private Movie movie;
    private Date schedule;
    private int cinemaRoom;
    private double price;
    private List<String> seatsList;
    private List<String> allSeats;


    public Session (Movie movie, Date schedule, int cinemaRoom, double price) {
        this.movie = movie;
        this.schedule = schedule;
        this.cinemaRoom = cinemaRoom;
        this.price = price;
        seatsList = new ArrayList<>();
        allSeats = new ArrayList<>();

        int seatsPerRow = 10;
        for (char row = 'A'; row <= 'P'; row++) {
            for (int i = 1; i <= seatsPerRow; i++) {
                allSeats.add(row + String.valueOf(i));
            }
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public Date getSchedule() {
        return schedule;
    }

    public int getCinemaRoom() {
        return cinemaRoom;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getSeatsList() {
        return seatsList;
    }

    public List<String> getAllSeats() {
        return allSeats;
    }


    public boolean isSeatAvailable(String seat) {
        return allSeats.contains(seat) && !seatsList.contains(seat);
    }


    public void reservarAssento(String seat) {
        if (!seatsList.contains(seat) && allSeats.contains(seat)) {
            seatsList.add(seat);
            System.out.println("Seat " + seat + " successfully reserved!");
        } else {
            System.out.println("This seat is already reserved or does not exist!");
        }
    }


    public void cancelarReserva(String seat) {
        if (seatsList.contains(seat)) {
            seatsList.remove(seat);
            System.out.println("Seat successfully removed!");
        } else {
            System.out.println("This seat is not reserved!");
        }
    }


    public List<String> listarAssentosDisponiveis() {
        List<String> availabeSeats = new ArrayList<>(allSeats);
        availabeSeats.removeAll(seatsList);
        return availabeSeats;
    }


    public void mostrarAssentosPorFileira() {
        int seatsPerRow = 10;
        for (char row = 'A'; row <= 'P'; row++) {
            System.out.print(row + " | ");
            for (int i = 1; i <= seatsPerRow; i++) {
                String seat = row + String.valueOf(i);
                if (seatsList.contains(seat)) {
                    System.out.print("[X] "); // ocupado
                } else {
                    System.out.print("[" + seat + "] "); // disponível
                }
            }
            System.out.println();
        }
    }


    @Override
    public String toString() {
        return "Session of movie: " + movie.getTitle() +
                " | Room: " + cinemaRoom +
                " | Hour: " + schedule +
                " | Price: R$" + price;
    }

}
