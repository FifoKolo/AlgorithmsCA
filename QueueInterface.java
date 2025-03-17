/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmsca;

/**
 *
 * @author mncrf
 */
public interface QueueInterface<T> {  //T= type

    public boolean isEmpty();

    public int size();

    public Object frontElement();

    void enqueue(T item);
    
    T dequeue();
}

