package freeCodeCamp_Java10;  // Lists and Sets -- can add Sets and Lists can be dynamic, arrays are set
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main10 {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>();
        intSet.add(5);
        intSet.add(9);
        intSet.add(1);
        intSet.add(8);
        intSet.add(5);     // will only add the first 5, doesnt even add the second 5 into the list
        intSet.add(7);

        intSet.remove(1);  // removes the 1 from the list
        int setSize = intSet.size();  // will give you the setSize



        boolean contains = intSet.contains(8);
        System.out.println(contains);
        System.out.println(intSet);
        System.out.println(setSize);

 // Tree Set
       Set<Integer> tree = new TreeSet<Integer>();
        tree.add(15);
        tree.add(21);
        tree.add(4);
        tree.add(72);
        tree.add(32);
        tree.add(27);

        int treeSize = tree.size();

        System.out.println(tree);
        System.out.println(treeSize);

 // Link Hash Set
        Set<Integer> link = new LinkedHashSet<Integer>();
        link.add(1);
        link.add(2);
        link.add(4);
        link.add(7);
        link.add(21);
        link.add(29);

        int linkSize = link.size();

        System.out.println(link);
        System.out.println(linkSize);




 // LISTS - Array List //
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(13);
        arrList.add(28);
        arrList.add(9);
        arrList.add(18);
        arrList.add(51);
        arrList.add(32);
        arrList.add(48);
        arrList.add(26);

        arrList.get(0);        // gives you 13
        arrList.set(1, 5);     // will change the Integer at index '1' to the # 5 (set index '1' <was 28> to 5)


        System.out.println(arrList);
        System.out.println(arrList.size());
        System.out.println(arrList.subList(0, 5)); // grabs a range starting at index '0' in this example and ending at index '5'


// LinkedList  -- Faster than Array List

        LinkedList<Integer> linkList = new LinkedList<Integer>();
        linkList.add(13);
        linkList.add(28);
        linkList.add(9);
        linkList.add(18);
        linkList.add(51);
        linkList.add(32);
        linkList.add(48);

        System.out.println(linkList);

    }
}