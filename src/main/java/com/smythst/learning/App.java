package com.smythst.learning;

import com.smythst.learning.core.datastructures.LinkedList.LinkedList;
import com.smythst.learning.core.datastructures.LinkedList.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node1 = new Node<>(1);
        LinkedList<Integer> list = new LinkedList<>();
        list.addToHead(node1);
        list.addToTail(node2);
        list.addToHead(node3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
