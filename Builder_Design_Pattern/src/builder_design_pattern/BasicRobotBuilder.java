package src.builder_design_pattern;

import src.robots.BasicRobot;

public interface BasicRobotBuilder {
     public void makeRobot(String name, int hp, int damage) ;

     public BasicRobot buildRobot(String name, int hp, int damage) ;


}
