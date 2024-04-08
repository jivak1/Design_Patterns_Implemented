package src;

import src.builder_design_pattern.RobotBossBuilder;
import src.robots.RobotBoss;

public class Main {
    public static void main(String[] args) {
        RobotBossBuilder robotBossBuilder = new RobotBossBuilder() ;

        RobotBoss robotBoss = (RobotBoss)robotBossBuilder.buildRobot("Gorlack the destroyer", 100, 10) ;

        robotBoss.battleCry();
    }
}
