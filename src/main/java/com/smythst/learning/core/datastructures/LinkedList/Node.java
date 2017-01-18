package com.smythst.learning.core.datastructures.LinkedList;


public class Node<T> {

    private T value;
    private Node<T> next;
    public static void printList(Node node){
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }

    }

    public Node(T initialValue) {
        value = initialValue;
    }
    public Node(T initialValue, Node<T> initialSibling) {
        this(initialValue);
        this.next = initialSibling;
    }

    public T getValue() {return value;}

    public void setValue(T value) {this.value = value;}

    public Node<T> getNext() {return next;}

    public void setNext(Node<T> next) {this.next = next;}
}
