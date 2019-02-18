package nl.han.oose;

public class WhatsAppSharingProvider implements Sharing {

    @Override
    public void shareUsingIMessage(String message) {
        throw new UnsupportedOperationException("Message not implemented.");
    }

    @Override
    public void shareUsingWhatsApp(String message) {
        System.out.println("Shared message: " + message);
    }

    @Override
    public void shareUsingEmail(String message) {
        throw new UnsupportedOperationException("Message not implemented.");
    }

    @Override
    public void shareOnFacebook(String message) {
        throw new UnsupportedOperationException("Message not implemented.");
    }
}
