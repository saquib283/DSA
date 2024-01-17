package DSA.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(7);
        ll.add(8);
        ll.add(5);
        ll.add(9);      
        ll.set(0, 100);
        ll.add(0, 1);
        ll.remove(0);
        ll.add(1,50);
        ll.remove(Integer.valueOf(100));//remove element with value 100
        System.out.println("Element at Index 0: " + ll.get(0));
        System.out.println("Size : " + ll.size());
        System.out.println(ll.contains(Integer.valueOf(9)));//Check if element is present in the list
        System.out.println("ArrayList : " + ll);// Print whole arraylist
    }
  
}
