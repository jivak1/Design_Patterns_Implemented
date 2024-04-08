package src.robots;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RobotBoss {
    private String name ;

    private int hp ;

    private int damage ;

    public void battleCry(){
        System.out.println("I am " + this.getName() + " and I have " + this.getHp() + " hp and I can deal " + this.getDamage() + " points of damage!");
    }
}
