package robots;

import observer_design_pattern.Subject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BigRobot extends BasicRobot implements Subject<SmallRobot> {
    private List<SmallRobot> robotList = new ArrayList<>() ;

    public BigRobot(){
        this.setName("Big Robot");
        this.setHp(100);
        this.setDamage(10);
    }
    @Override
    public void register(SmallRobot smallRobot) {
        robotList.add(smallRobot) ;
    }

    @Override
    public void unregister(SmallRobot smallRobot) {
        robotList.remove(smallRobot) ;
    }

    @Override
    public void notifyObservers() {
        Queue<SmallRobot> smallRobotQueue = new LinkedList<>(robotList) ;

        for(SmallRobot smallRobot : smallRobotQueue){
            smallRobot.takeDamage(getDamage());

            if(smallRobot.getHp() <= 0){
                unregister(smallRobot);

                System.out.println(System.identityHashCode(smallRobot) + " died!");
            }
        }
    }
}
