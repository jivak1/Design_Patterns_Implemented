package robots;

public class BigRobot extends BasicRobot{

    @Override
    public BigRobot makeCopy() {
        BigRobot bigRobotClone = null ;

        try {
            bigRobotClone = (BigRobot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return bigRobotClone ;
    }
}
