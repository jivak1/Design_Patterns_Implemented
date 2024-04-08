package strategy_design_pattern;

public interface SmallAttackStrategy extends AttackStrategy {

    @Override
    public default void attack() {
        System.out.println("Small robot attacked!");
    }
}
