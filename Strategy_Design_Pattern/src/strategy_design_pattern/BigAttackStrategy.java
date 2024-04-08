package strategy_design_pattern;

public interface BigAttackStrategy extends AttackStrategy{
    @Override
    public default void attack() {
        System.out.println("Big robot attacked!");
    }
}
