package nl.han.oose;

public class MyApp {

    private Sharing sharingService;

    public MyApp(Sharing sharingService) {
        this.sharingService = sharingService;
    }

    public void doSomething() {
        System.out.println("Did something fancy");
        sharingService.shareUsingWhatsApp("Hey, I just did something fancy");
        sharingService.shareUsingEmail("Hey, I just did something fancy");
    }

    public static void main(String[] args) {

        // In the following LOC it is not possible to inject a provider, because
        // none of the providers implements the entire interface
        // the entire design is bad and the interfaces should be split up
        MyApp app = new MyApp(null);
        
    }


}
