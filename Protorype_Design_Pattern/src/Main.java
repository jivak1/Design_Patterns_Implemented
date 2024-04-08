import prototype_design_pattern.BigRobotPrototypeFactory;
import robots.BigRobot;

public class Main {
    public static void main(String[] args) {

        BigRobot bigRobot = new BigRobot() ;

        BigRobotPrototypeFactory bigRobotPrototypeFactory = new BigRobotPrototypeFactory() ;

        BigRobot bigRobotClone = bigRobotPrototypeFactory.getClone(bigRobot) ;

        bigRobot.battlecry();

        bigRobotClone.battlecry();
    }
}