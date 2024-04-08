package robots;

import strategy_design_pattern.SmallAttackStrategy;

public class SmallRobot extends BasicRobot implements SmallAttackStrategy {
    public SmallRobot(){
        this.setName("Small Robot");
        this.setHp(40);
        this.setDamage(4);
    }
}
