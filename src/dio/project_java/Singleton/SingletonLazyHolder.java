package dio.project_java.Singleton;

/**
 * modo padrão : Singleton "LAZY HOLDER" apressado
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author Brunna de Yeshua
 */
public class SingletonLazyHolder {


    private static class InstanceHolder{
   public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

        private SingletonLazyHolder() {
            super();
        }

        public static SingletonLazyHolder getInstance(){

            return  InstanceHolder.instancia;
        }


    public static class Test {

        public static void main(String[] args) {

            // Testes relacionados ao Design Pattern Singleton:

            System.out.println("**********************************SingletonLazy***************************************");

            SingletonLazy lazy=SingletonLazy.getInstance();
            System.out.println(lazy);
            lazy=SingletonLazy.getInstance();
            System.out.println(lazy);

            System.out.println("****************************************SingletonEager********************************");

            SingletonEager eager=SingletonEager.getInstance();
            System.out.println(eager);
            eager=SingletonEager.getInstance();
            System.out.println(eager);

            System.out.println("*************************************SingletonLazyHolder*****************************");

            SingletonLazyHolder holder = getInstance();
            System.out.println(holder);
            holder= getInstance();
            System.out.println(holder);


        }
    }
}




