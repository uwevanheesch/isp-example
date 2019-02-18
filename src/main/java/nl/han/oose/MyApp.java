package nl.han.oose;

public class MyApp {

    private WhatsAppSharing whatsAppSharingService;
    private EmailSharing mailSharingService;

    public MyApp(WhatsAppSharing whatsAppSharingService, EmailSharing mailSharingService) {
        this.whatsAppSharingService = whatsAppSharingService;
        this.mailSharingService = mailSharingService;
    }

    public void doSomething() {
        System.out.println("Did something fancy");
        whatsAppSharingService.shareUsingWhatsApp("Hey, I just did something fancy");
        mailSharingService.shareUsingEmail("Hey, I just did something fancy");
    }

    public static void main(String[] args) {

        MyApp app = new MyApp(new WhatsAppSharingProvider(),
                new MailSharingProvider());
        app.doSomething();

    }


}
