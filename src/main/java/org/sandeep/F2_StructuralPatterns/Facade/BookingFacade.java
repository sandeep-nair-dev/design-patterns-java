package org.sandeep.F2_StructuralPatterns.Facade;

public class BookingFacade {
    public void bookTicket(User user, String movieName) throws InterruptedException {
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        Ticket ticket = ticketBookingSystem.createTicket(movieName, user);
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.executePayment(user, ticket);
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.sendEmail(ticket, user);
        notificationSystem.sendSMS(ticket, user);
    }
}
