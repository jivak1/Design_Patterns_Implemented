package strategy_design_pattern;

public interface BossAttackStrategy extends AttackStrategy{
    @Override
    public default void attack() {
        System.out.println("Boss robot attacked!");
    }
}
