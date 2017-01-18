package com.smythst.learning.core.datastructures.LinkedList;


import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>, Iterator<T>{

    private Node<T> head;
    private Node<T> tail;
    private int countOfNodes;
    private Node<T> next;

    public LinkedList() {
        head = null;
        tail = null;
        next = null;
        countOfNodes = 0;
    }

    public LinkedList(Node<T> head, Node<T> tail) {
        this.head = head;
        this.tail = tail;
        next = this.head;
        countOfNodes = 2;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public T next() {
        T returnValue = next.getValue();
        next = next.getNext();
        return returnValue;
    }

    @Override
    public Iterator<T> iterator() {
        next = head;
        return this;
    }

    public void addToHead(T value) {
        addToHead(new Node<T>(value));
    }

    public void addToHead(Node<T> newHead) {
        Node<T> oldHead = head;
        head = newHead;
        head.setNext(oldHead);

        countOfNodes++;
        if(countOfNodes == 1) {
            tail = head;
        }
    }

    public void addToTail(T value) {
        addToTail(new Node<T>(value));
    }

    public void addToTail(Node<T> newTail) {
        if(countOfNodes == 0) {
            head = newTail;
        } else {
            tail.setNext(newTail);
        }
        tail = newTail;
        countOfNodes++;
    }

    public void removeFirst() {
        if(countOfNodes != 0) {
            head = head.getNext();
            countOfNodes--;
        }
        if(countOfNodes == 0) {
            tail = null;
        }
    }

    public void removeLast() {
        if(countOfNodes != 0) {
            if(countOfNodes == 1) {
                head = null;
                tail = null;
            } else {
                Node<T> currentNode = head;
                while(currentNode.getNext() != tail) {
                    currentNode = currentNode.getNext();
                }
                currentNode.setNext(null);
                tail = currentNode;
            }
            countOfNodes--;
        }
    }

    public void remove(Node<T> value) {
        if(countOfNodes == 0) {
            return;
        }

        for(T nodeValue : this) {
            if (nodeValue.equals(value)) {
                if()
            }
        }
    }

    public int getCountOfNodes() {
        return countOfNodes;
    }

    public void setCountOfNodes(int countOfNodes) {
        this.countOfNodes = countOfNodes;
    }
}
