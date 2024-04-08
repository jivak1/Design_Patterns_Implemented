package src.builder_design_pattern;

import src.robots.BasicRobot;
import src.robots.RobotBoss;

public class RobotBossBuilder implements BasicRobotBuilder {
    private RobotBoss robotBoss ;

    public RobotBossBuilder(){
        this.robotBoss = new RobotBoss() ;
    }

    @Override
    public void makeRobot(String name, int hp, int damage) {
        this.robotBoss.setName(name);
        this.robotBoss.setHp(hp);
        this.robotBoss.setDamage(damage);
    }

    @Override
    public BasicRobot buildRobot(String name, int hp, int damage) {
        makeRobot(name, hp, damage);

        return robotBoss;
    }


}
