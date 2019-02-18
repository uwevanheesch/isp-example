package nl.han.oose;

public class MailSharingProvider implements Sharing {
    @Override
    public void shareUsingIMessage(String message) {
        throw new UnsupportedOperationException("Message not implemented.");
    }

    @Override
    public void shareUsingWhatsApp(String message) {
        throw new UnsupportedOperationException("Message not implemented.");
    }

    @Override
    public void shareUsingEmail(String message) {
        System.out.println("Mailed: " + message);
    }

    @Override
    public void shareOnFacebook(String message) {
        throw new UnsupportedOperationException("Message not implemented.");
    }
}
