package org.sandeep.F2_StructuralPatterns.Facade;

public class Ticket {
    private int ticketNumber;
    private User user;
    private String movieName;

    public Ticket(int ticketNumber, User user, String movieName) {
        this.ticketNumber = ticketNumber;
        this.user = user;
        this.movieName = movieName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
