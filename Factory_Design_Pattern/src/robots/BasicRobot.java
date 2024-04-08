package robots;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public abstract class BasicRobot {
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
        System.out.println("I am " + this.getName() + ", and I have " + this.getHp() + " hp, and I deal " + this.getDamage() + " damage!");
    }
}
