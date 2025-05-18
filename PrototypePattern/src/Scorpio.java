public class Scorpio implements IScorpioPrototype, Cloneable{
    ScorpioEngine engine;

    public Scorpio(){
        this.engine = new ScorpioEngine();
    }

    private Scorpio(ScorpioEngine scorpioEngine){
        this.engine = new ScorpioEngine(scorpioEngine);
    }

    @Override
    public void startEngine(){
       System.out.println("Scorpio started"); 
    }

    @Override
    public IScorpioPrototype clone(){
        IScorpioPrototype clonedScorpio = new Scorpio(this.engine);
        return clonedScorpio;
    }

    @Override
    public void setEngine(ScorpioEngine eng){
        this.engine = eng;
    }
}
