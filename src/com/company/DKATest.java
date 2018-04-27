package com.company;


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;

import static org.junit.Assert.*;

public class DKATest {
    @org.junit.Test
    public  void test() throws DkaException {
        Set<Integer> A = new HashSet<>(0);
        A.add(1);
        A.add(0);
        Set<String> Q=new HashSet<>(0);
        Q.add("q1");
        Q.add("q2");
        Q.add("q3");
        Set<String> F=new HashSet<>(0);
        F.add("q2");
        String q0="q1";
        Map<Pair<Integer, String>, Pair<Integer, String>> delta=new HashMap<>();
        delta.put(new Pair(1,"q1"),new Pair("","q2"));
        delta.put(new Pair(0,"q1"),new Pair("","q1"));
        delta.put(new Pair(0,"q2"),new Pair("","q3"));
        delta.put(new Pair(1,"q2"),new Pair("","q2"));
        delta.put(new Pair(0,"q3"),new Pair("","q2"));
        delta.put(new Pair(1,"q3"),new Pair("","q2"));
        DKA dka=new DKA(A,Q,q0,F,delta);
       // System.out.print(dka.getDelta().keySet());
        ArrayList<Integer> test_array=new ArrayList<>();
        test_array.add(1);
        test_array.add(0);
        test_array.add(0);
        test_array.add(1);
        test_array.add(0);
        dka.action(test_array);
        assertFalse(F.contains(dka.getQ0()));
    }
    @org.junit.Test
    public  void test1() throws DkaException {
        Set<Integer> A = new HashSet<>(0);
        A.add(1);
        A.add(0);
        Set<String> Q=new HashSet<>(0);
        Q.add("q1");
        Q.add("q2");
        Q.add("q3");
        Set<String> F=new HashSet<>(0);
        F.add("q2");
        String q0="q1";
        Map<Pair<Integer, String>, Pair<Integer, String>> delta=new HashMap<>();
        delta.put(new Pair(1,"q1"),new Pair("","q2"));
        delta.put(new Pair(0,"q1"),new Pair("","q1"));
        delta.put(new Pair(0,"q2"),new Pair("","q3"));
        delta.put(new Pair(1,"q2"),new Pair("","q2"));
        delta.put(new Pair(0,"q3"),new Pair("","q2"));
        delta.put(new Pair(1,"q3"),new Pair("","q2"));
        DKA dka=new DKA(A,Q,q0,F,delta);
        // System.out.print(dka.getDelta().keySet());
        ArrayList<Integer> test_array=new ArrayList<>();
        test_array.add(1);
        test_array.add(0);
        test_array.add(0);
        dka.action(test_array);
        assertTrue(F.contains(dka.getQ0()));
    }
}