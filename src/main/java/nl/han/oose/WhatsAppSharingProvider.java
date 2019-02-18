package nl.han.oose;

public class WhatsAppSharingProvider implements WhatsAppSharing {

    @Override
    public void shareUsingWhatsApp(String message) {
        System.out.println("Shared message via WhatsApp: " + message);
    }

}
