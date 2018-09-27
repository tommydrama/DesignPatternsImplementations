package singleton;

public class Singleton2 {

        //shorter way to get a Singleton

    public static final Singleton2 instance = new Singleton2();
    public String name;

    private Singleton2(){}
}
