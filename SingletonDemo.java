/**
 * Created by igorcosta on 13/09/15.
 */
public class SingletonDemo {

    public static SingletonDemo instance = null;

    protected  SingletonDemo(){

    }

    public synchronized static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
