public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        HotAirBalloon balloon = new HotAirBalloon();
        Adapter adapter = new Adapter(balloon);
        adapter.start();
    }
}
