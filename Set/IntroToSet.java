package Set;
import  java.util.*;
import java.util.HashSet;

public class IntroToSet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(new Integer[] {2,6,8,12,3,5,9}));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(4);
        set2.add(1);
        set2.add(12);
        set2.add(2);

//        Union
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union of two set : "+union);

//        Intersection
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of two set : "+ intersection);

//        Symmetric difference
        Set<Integer> difference = new HashSet<Integer>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of two set : "+difference);
        
    }
}
