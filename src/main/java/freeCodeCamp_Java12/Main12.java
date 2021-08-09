package freeCodeCamp_Java12;  // Map Example
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main12 {
    public static void main(String[] args) {
        Map mippy = new HashMap();
        String stringyMap = "Hello this is Trelvyn, King of all cats. I am very pleased to meet you.";

        // loop through the string
        for (char x : stringyMap.toCharArray()) {
            if (mippy.containsKey(x)) {
                int old = (int) mippy.get(x);
                mippy.put(x, old + 1);
            } else {
                mippy.put(x, 1);
            }
        }
        mippy.remove(' ');  // this would remove the ' ' <blank space> from the map
        System.out.println(mippy);

        // Sorting
        int[] x = {-99, 5, 6, 2, 3, 6, 7, 43, 12, 9, 1, 87};

        Arrays.sort(x);

        for (int i : x) {
            System.out.print(i + ", ");      // will print -99, 1, 2, 3, 5, 6, 6, 7, 9, 12,43, 87
        }
    }
}
