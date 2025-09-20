package org.sandeep.F2_StructuralPatterns.Facade;

public class TicketBookingSystem {

    public boolean validateAvailability(String movieName) {
        return !(movieName.equals("NA"));
    }

    public Ticket createTicket(String movieName, User user) {
        System.out.println("Booking ticket for movie: " + movieName + " for user: " + user.getUsername());
        return new Ticket((int) (Math.random() * 100), user, movieName);
    }
}
