package src.robots;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public abstract class BasicRobot {
    private String name ;

    private int hp ;

    private int damage ;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setName(String name){
        this.name = name ;

        System.out.println("Robot is named " + getName() + "!");
    }

    public void setHp(int hp){
        this.hp = hp ;

        System.out.println("Robot has " + getHp() + " hp!");
    }

    public void setDamage(int damage) {
        this.damage = damage;

        System.out.println("Robot can deal " + getDamage() + " damage!" );
    }
}
