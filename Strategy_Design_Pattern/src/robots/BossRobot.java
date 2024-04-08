package robots;

import strategy_design_pattern.BossAttackStrategy;

public class BossRobot extends BasicRobot implements BossAttackStrategy {
    public BossRobot(){
        this.setName("Boss Robot");
        this.setHp(1000);
        this.setDamage(100);
    }
}
