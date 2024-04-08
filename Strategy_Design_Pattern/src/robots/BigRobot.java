package robots;

import strategy_design_pattern.BigAttackStrategy;

public class BigRobot extends BasicRobot implements BigAttackStrategy {

    public BigRobot(){
        this.setName("Big Robot");
        this.setHp(100);
        this.setDamage(10);
    }

}
