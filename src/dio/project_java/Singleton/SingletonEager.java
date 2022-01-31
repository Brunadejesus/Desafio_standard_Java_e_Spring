package dio.project_java.Singleton;


/**
 * modo padrão : Singleton "rapido" apressado
 * @author Brunna de Yeshua
 */


public class SingletonEager {

    private static SingletonEager instancia=new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static  SingletonEager getInstance(){

        return instancia;
    }



}
