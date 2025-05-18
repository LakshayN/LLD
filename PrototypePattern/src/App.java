public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        IScorpioPrototype prototype = new Scorpio();

        IScorpioPrototype scorpioN = prototype.clone();
        scorpioN.setEngine(new ScorpioNEngine());

        IScorpioPrototype scorpioClassic = prototype.clone();
        scorpioClassic.setEngine(new ScorpioClassicEngine());
        
    }
}
