package observer_design_pattern;

public interface Subject<T> {
    public void register(T smallRobot);
    public void unregister(T smallRobot);
    public void notifyObservers();
}
