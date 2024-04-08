package factory_design_pattern;

public interface BasicFactory<T> {
    public T getInstance(String instanceType) ;
}
