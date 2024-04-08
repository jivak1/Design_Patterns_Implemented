import robots.BigRobot;
import robots.SmallRobot;

public class Main {
    public static void main(String[] args) {

        BigRobot bigRobot = new BigRobot() ;

        SmallRobot smallRobot1 = new SmallRobot() ;
        SmallRobot smallRobot2 = new SmallRobot() ;
        SmallRobot smallRobot3 = new SmallRobot() ;

        bigRobot.register(smallRobot1);
        bigRobot.register(smallRobot2);
        bigRobot.register(smallRobot3);

        bigRobot.notifyObservers();
        bigRobot.notifyObservers();
        bigRobot.notifyObservers();
        bigRobot.notifyObservers();
        bigRobot.notifyObservers();
        bigRobot.notifyObservers();
        bigRobot.notifyObservers();
    }
}