package robots;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BasicRobot implements Cloneable {
    private String name ;

    private int hp ;

    private int damage ;

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void battlecry(){
        System.out.println("I am " + System.identityHashCode(this));
    }

    public abstract BasicRobot makeCopy();
}
