import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance = null;
    private int value = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if(instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    protected Singleton readResolve() {
        return instance;
    }

    public int getValue() {
        return value;
    }
}
