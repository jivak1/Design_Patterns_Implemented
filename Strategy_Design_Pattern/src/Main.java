import robots.BigRobot;
import robots.BossRobot;
import robots.SmallRobot;

public class Main {
    public static void main(String[] args) {
        SmallRobot smallRobot = new SmallRobot() ;
        BigRobot bigRobot = new BigRobot() ;
        BossRobot bossRobot = new BossRobot() ;

        smallRobot.attack();
        bigRobot.attack();
        bossRobot.attack();
    }
}