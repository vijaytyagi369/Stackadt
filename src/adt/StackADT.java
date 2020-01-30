package adt;

public interface StackADT<E>{

    boolean isEmpty();

    E peek();

    E pop();

    void push(E data);


}
