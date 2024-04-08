import factory_design_pattern.RobotFactory;
import robots.BigRobot;
import robots.BossRobot;
import robots.SmallRobot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Available robot types: Boss Robot, Big Robot, Small Robot");

        Scanner scanner = new Scanner(System.in) ;

        RobotFactory robotFactory = new RobotFactory() ;

        BossRobot bossRobot = (BossRobot) robotFactory.getInstance("Boss Robot");

        BigRobot bigRobot = (BigRobot) robotFactory.getInstance("Big Robot");

        SmallRobot smallRobot = (SmallRobot) robotFactory.getInstance("Small Robot");

        bossRobot.battlecry();
        bigRobot.battlecry();
        smallRobot.battlecry();
    }
}