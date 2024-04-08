package factory_design_pattern;

import robots.BasicRobot;
import robots.BigRobot;
import robots.BossRobot;
import robots.SmallRobot;

public class RobotFactory implements BasicFactory<BasicRobot>{
    @Override
    public BasicRobot getInstance(String robotType) {
        BasicRobot robot = null ;
        switch (robotType){
            case "Big Robot":
                robot = new BigRobot() ;

                return robot ;
            case "Small Robot":
                robot = new SmallRobot() ;

                return robot ;
            case "Boss Robot":
                robot = new BossRobot() ;

                return robot ;
            default:

                return robot ;
        }
    }
}
