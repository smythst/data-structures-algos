package com.smythst.learning;

import com.smythst.learning.core.datastructures.LinkedList.LinkedList;
import com.smythst.learning.core.datastructures.LinkedList.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;


/**
 * Unit test for simple App.
 */
public class AppTest {

    LinkedList<Integer> list;

    @Before
    public void setUp() {
        list = new LinkedList<>();
    }

    @Test
    public void givenEmptyLinkedList_next_returnsNull()
    {
        assertNull(list.next());
    }

    @Test
    public void givenEmptyLinkedList_afterAddingTwoElements_getCountOfNodesReturnsTwo() {
        list.addToHead(1);
        list.addToHead(2);
        Assert.assertTrue(list.getCountOfNodes() == 2);
    }

    @Test
    public void givenLinkedListWithOneElement_removingElement_leavesEmptyList() {
        Node<Integer> node = new Node<>(1);
        list.addToHead(node);
        assertEquals(list.getCountOfNodes(), 1);
        list.remove(node);
        assertEquals(list.getCountOfNodes(), 0);
    }

    @Test
    public void givenPopulatedList_forEachLoop_iteratesAllNodesInCorrectOrder() {

        List<Node<Integer>> nodes = new ArrayList<>(10);
        for(int i = 0; i< 10; i++) {
            Node<Integer> node = new Node<>(i);
            nodes.add(node);
            list.addToTail(node);
        }
        assertEquals(list.getCountOfNodes(), nodes.size());
        int i = 0;
        for(Integer node : list) {
            System.out.println("List node: " + nodes.get(i).getValue() + " | LinkedList node:" + node);
            assertEquals(node, nodes.get(i).getValue());
            i++;
        }

    }
}
