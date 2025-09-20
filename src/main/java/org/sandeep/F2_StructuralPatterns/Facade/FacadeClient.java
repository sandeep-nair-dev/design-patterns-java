package org.sandeep.F2_StructuralPatterns.Facade;

public class FacadeClient {
    public static void main(String[] args) throws InterruptedException {
        User user = new User("sandeep", "sandeep@gmail.com", "1234567890");

        //Whole logic is written here
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();
        Ticket ticket = ticketBookingSystem.createTicket("Avengers I", user);
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.executePayment(user, ticket);
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.sendEmail(ticket, user);
        notificationSystem.sendSMS(ticket, user);

        System.out.println("-------------------------------------------------------------------------------------");
        //Whole business logic is written in facade. The client doesn't need to know the internal business working. The client just need to interact with the Facade.
        BookingFacade bookingFacade = new BookingFacade();
        bookingFacade.bookTicket(user, "Avengers II");
    }
}
