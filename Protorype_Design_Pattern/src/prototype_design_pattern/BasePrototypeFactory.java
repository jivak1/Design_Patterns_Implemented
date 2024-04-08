package prototype_design_pattern;

public interface BasePrototypeFactory<T extends Cloneable> {
    public  T getClone(T toClone) ;
}
