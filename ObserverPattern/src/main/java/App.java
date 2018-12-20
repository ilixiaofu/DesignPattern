import com.lxf.pattern.util.Observable;
import com.lxf.pattern.util.Observer;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        MyObserver myObserver = new MyObserver();
        Observable observable = new Observable();
        observable.addObserver(myObserver);
        observable.setChanged(true);
        observable.notifyObservers("dfdf");
    }

    private static class MyObserver implements Observer {

        @Override
        public void update(Observable observable, Object arg) {
            System.out.println( arg );
        }
    }
}
