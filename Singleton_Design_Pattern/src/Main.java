package src;

import src.singleton_design_pattern.RobotBossSingleton;
import src.robots.RobotBoss;

public class Main{
    public static void main(String[] args) {
        RobotBoss robotBoss = RobotBossSingleton.getInstance() ;

        robotBoss.battleCry();
    }
}