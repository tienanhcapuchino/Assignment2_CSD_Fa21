/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ptuan
 */
import java.util.LinkedList;
public class MyQueue {
  LinkedList<Integer> t;
  MyQueue() {
    t = new LinkedList<>();  
  }
  void clear() {
     t.clear(); 
  }
  boolean isEmpty() {
     return(t.isEmpty()); 
  }
  void enqueue(Integer x) {
     t.addLast(x);
  }
  Integer dequeue() {
     if(isEmpty()) return(null);
     return(t.removeFirst());
  }  
  Integer front() {
     if(isEmpty()) return(null);
     return(t.getFirst());
  }  
}

