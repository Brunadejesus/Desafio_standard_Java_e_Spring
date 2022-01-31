package dio.project_java.Singleton;

public class Test_Singleton {
    public static void main(String[] args) {

        System.out.println("\n*****************************************************************************");

        SingletonLazy lazy=SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("*****************************************************************************");

        SingletonEager eager=SingletonEager.getInstance();
        System.out.println(eager);
        eager=SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("*****************************************************************************");

        SingletonLazyHolder holder=SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder=SingletonLazyHolder.getInstance();
        System.out.println(holder);

    }
}
