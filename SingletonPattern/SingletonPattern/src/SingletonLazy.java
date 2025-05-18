public class SingletonLazy {
    private SingletonLazy(){}

    private static class Holder{
        private static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return Holder.INSTANCE;
    }
}
