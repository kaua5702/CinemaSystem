package com.kauabiscotto.CinemaSystem;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Example movie and session
        Movie movie = new Movie("Matrix", 136, MovieGenre.ACTION, 14);
        Session session = new Session(movie, new Date(), 1, 20.0);

        System.out.println("Welcome to the Cinema!");
        Thread.sleep(1500); // delay of 1.5 seconds

        System.out.println(session); // show session info
        Thread.sleep(1500);

        // Show seats in matrix format
        System.out.println("\nLoading seat map...");
        Thread.sleep(2000);
        session.mostrarAssentosPorFileira();

        String seat;
        boolean reservedSuccessfully = false;

        // Loop until user chooses a valid seat
        while (!reservedSuccessfully) {
            System.out.print("\nEnter the seat you want to reserve: ");
            seat = scanner.nextLine();

            if (session.isSeatAvailable(seat)) {
                reservedSuccessfully = true;

                Thread.sleep(1000);
                System.out.print("Is it a half-price ticket? (y/n): ");
                String halfPriceInput = scanner.nextLine();
                boolean halfPrice = halfPriceInput.equalsIgnoreCase("y");

                // Create ticket
                System.out.println("\nGenerating ticket...");
                Thread.sleep(2000);
                Ticket ticket = new Ticket(session, seat, halfPrice);

                // Show ticket
                System.out.println("\nTicket generated:");
                System.out.println(ticket);

                Thread.sleep(1500);
                // Show updated seat map
                System.out.println("\nUpdating seat map...");
                Thread.sleep(2000);
                session.mostrarAssentosPorFileira();
            } else {
                System.out.println("This seat is not available. Please try again!");
                Thread.sleep(1000);
            }
        }

        scanner.close();
    }
}