package nl.han.oose;

public class SharingAdapter implements MySharingService {

    private WhatsAppSharingProvider whatsAppSharingProvider = new WhatsAppSharingProvider();
    private MailSharingProvider mailSharingProvider = new MailSharingProvider();

    @Override
    public void shareUsingWhatsApp(String message) {
        whatsAppSharingProvider.shareUsingWhatsApp(message);
    }

    @Override
    public void shareUsingEmail(String message) {
        mailSharingProvider.shareUsingEmail(message);
    }
}
