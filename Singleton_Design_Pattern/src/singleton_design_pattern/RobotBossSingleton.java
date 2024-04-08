package src.singleton_design_pattern;

import src.robots.RobotBoss;

public abstract class RobotBossSingleton {
    private static RobotBoss robotBoss ;
//    Eager initialization trough static initializer.
    static{
        robotBoss = new RobotBoss("Gorlack the destroyer", 100, 10) ;
    }

    public static RobotBoss getInstance(){
//        Lazy initialization through the static method
        if(robotBoss == null){
            robotBoss = new RobotBoss("Gorlack the destroyer", 100, 10) ;
        }
        return robotBoss ;
    }
}
