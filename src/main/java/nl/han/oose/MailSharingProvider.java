package nl.han.oose;

public class MailSharingProvider implements EmailSharing {

    @Override
    public void shareUsingEmail(String message) {
        System.out.println("Mailed: " + message);
    }

}
