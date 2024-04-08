package prototype_design_pattern;

import robots.BasicRobot;
import robots.BigRobot;

public class BigRobotPrototypeFactory implements BasePrototypeFactory<BigRobot>{
    @Override
    public BigRobot  getClone(BigRobot bigRobot)  {
        return bigRobot.makeCopy();
    }
}
