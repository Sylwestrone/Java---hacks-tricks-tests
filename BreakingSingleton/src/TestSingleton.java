import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton  {


    public void test() {
        Class singletonClass = Singleton.class;
        try {
            Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            try {
                Singleton singletonObj = constructor.newInstance();
                Singleton singletonObj2 = Singleton.getInstance();

                System.out.println(singletonObj == singletonObj2);
                //System.out.printf(String.valueOf(singletonObj.readResolve()));

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
