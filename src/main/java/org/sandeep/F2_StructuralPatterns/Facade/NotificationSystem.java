package org.sandeep.F2_StructuralPatterns.Facade;

public class NotificationSystem {
    public void sendEmail(Ticket ticket, User user){
        System.out.println("Sending email to " + user.getEmail() +":::Ticket for movie " + ticket.getMovieName() + " confirmed for " + user.getUsername());
    }

    public void sendSMS(Ticket ticket, User user){
        System.out.println("Sending sms to " + user.getNumber()+":::Ticket for movie " + ticket.getMovieName() + " confirmed for " + user.getUsername());
    }
}
