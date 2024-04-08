package robots;

import observer_design_pattern.Observer;

public class SmallRobot extends BasicRobot implements Observer {
    public SmallRobot(){
        this.setName("Small Robot");
        this.setHp(40);
        this.setDamage(10);
    }
    @Override
    public void takeDamage(int damage) {
        this.setHp(this.getHp() - damage);

        System.out.println(this.getName() + " " + System.identityHashCode(this) + " took " + damage + " damage!");
    }
}
