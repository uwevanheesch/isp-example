package nl.han.oose;

public class MyApp {

    private MySharingService sharingService;

    public MyApp(MySharingService sharingService) {
        this.sharingService = sharingService;
    }

    public void doSomething() {
        System.out.println("Did something fancy");
        sharingService.shareUsingWhatsApp("Hey, I just did something fancy");
        sharingService.shareUsingEmail("Hey, I just did something fancy");
    }

    public static void main(String[] args) {
        SharingAdapter sharingAdapter = new SharingAdapter();
        MyApp app = new MyApp(sharingAdapter);
        app.doSomething();

    }


}
