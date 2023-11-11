package uk.ac.rgu.cm2115;

public abstract class Controller<T> {

    protected T model;

    public abstract void setModel(T model);
    
}
