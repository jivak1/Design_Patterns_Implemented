package src.robots;



public class RobotBoss extends BasicRobot {

    public void battleCry(){
        System.out.println("I am " + this.getName() + " and I have " + this.getHp() + " hp and I can deal " + this.getDamage() + " points of damage!");
    }
}
