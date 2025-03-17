/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmsca;

/**
 *
 * @author mncrf
 */
public class SlNode {

    private Object element;
    private SlNode next;

    public SlNode(Object inElement, SlNode inNode) {
        element = inElement;
        next = inNode;
    }

    public SlNode getNext() {
        return next;
    }

    public void setNext(SlNode inNode) {
        next = inNode;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object inElement) {
        element = inElement;
    }

    public String toString() {
        return element.toString();
    }
}
