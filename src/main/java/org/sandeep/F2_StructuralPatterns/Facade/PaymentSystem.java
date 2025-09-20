package org.sandeep.F2_StructuralPatterns.Facade;

public class PaymentSystem {
    public void executePayment(User user, Ticket ticket) throws InterruptedException {
        System.out.println("Initiating payment for ticket number: " + ticket.getTicketNumber() + " for movie: " + ticket.getMovieName());
        Thread.sleep(1000);
        System.out.println("Processing payment for ticket number: " + ticket.getTicketNumber() + " for movie: " + ticket.getMovieName());
        Thread.sleep(1000);
        System.out.println("Completed payment for ticket number: " + ticket.getTicketNumber() + " for movie: " + ticket.getMovieName());
    }
}
