package dio.project_java.Singleton;


/**
 * modo padrão : Singleton "Preguiçoso"
 * @author Brunna de Yeshua
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static  SingletonLazy getInstance(){
        if(instancia==null){
            instancia=new SingletonLazy();

        }
        return instancia;
    }
}
