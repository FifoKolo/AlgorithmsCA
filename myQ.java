/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmsca;

import java.util.ArrayList;

/**
 *
 * @author mncrf
 */


public class MyQ implements QueueInterface<Patient> {
    private ArrayList<Patient> theQueue;

    public  MyQ() {
        theQueue = new ArrayList<Patient>();
    }

    @Override
    public void enqueue(Patient patient) {
        // priority order
        int index = 0;
        while (index < theQueue.size() && patient.compareTo(theQueue.get(index)) >= 0) {
            index++;
        }
        theQueue.add(index, patient); // Inserts at the correct position
    }

    @Override
    public Patient dequeue() {
        if (isEmpty()) throw new IllegalStateException("Queue is empty");
        return theQueue.remove(0); // Remove and return the front (highest priority)
    }

    @Override
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    @Override
    public int size() {
        return theQueue.size();
    }
    
    public ArrayList<Patient> getQueue() {
        return new ArrayList<>(theQueue); // Return a copy to protect encapsulation
    }

    
    public Patient frontElement() { 
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }
}

