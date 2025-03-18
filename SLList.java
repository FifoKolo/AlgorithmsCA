/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithmsca;

/**
 *
 * @author mncrf
 */
public class SLList implements LLInterface {

    private SlNode head;
    private int iSize;
    private SlNode currNode;
    private SlNode prevNode;

    public SLList() {
        head = null;
        iSize = 0;
        currNode = null;
        prevNode = null;
    }

    @Override
    public boolean isEmpty() {
        if (iSize == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return iSize;
    }

    
    @Override
    public void add(int iPosition, Object theElement) {
        
        if (iPosition == 1) {
            SlNode newNode = new SlNode(theElement, head);
            head = newNode;
        } else {
            setCurrent(iPosition);
            SlNode newNode = new SlNode(theElement, currNode);
            prevNode.setNext(newNode);
        }
        
        iSize = iSize + 1;
    }

    
    @Override
    public void add(Object theElement) {
        SlNode newNode = new SlNode(theElement, null);
        if (head == null) {
            head = newNode;
        } else {
            setCurrent(iSize);
            currNode.setNext(newNode);
        }
        iSize = iSize + 1;
    }

    @Override
    public Object get(int iPosition) {
        setCurrent(iPosition);
        return currNode;
    }

    @Override
    public void remove(int iPosition) {
        // special case for removing the head of the list / first node.
        if (iPosition == 1) {
            head = head.getNext();
        } else {
            // find the previous and current nodes
            setCurrent(iPosition);
            prevNode.setNext(currNode.getNext());
        }
        // as one node was removed the size counter must be decremented by 1
        iSize = iSize - 1;
    }

    private void setCurrent(int iPosition) {
        // sets currNode to the node at position specified by index
        // sets prevNode to the node previous to currNode
        int iCount;
        prevNode = null;
        currNode = head;
        for (iCount = 1; iCount < iPosition; iCount++) {
            prevNode = currNode;
            currNode = currNode.getNext();
        }
    }

    // Updated to return a string instead of printing
    @Override
    public void printList() {
        SlNode tempNode = head;
        StringBuilder sb = new StringBuilder();
        while (tempNode != null) {
            sb.append(tempNode.toString()).append("\n");
            tempNode = tempNode.getNext();
        }
        System.out.print(sb.toString()); // Keep for debugging, optional
    }

   
}