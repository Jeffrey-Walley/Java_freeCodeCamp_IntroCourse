package freeCodeCamp_Java11;    // Maps and HashMaps

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.LinkedHashMap;

public class Main11 {
  public static void main(String[] args) {
    Map mippy = new HashMap();
    mippy.put("Trelvyn", "cat");
    mippy.put("IsIs", "cat");
    mippy.put("Ra", "human");
    mippy.put("Jim", "human");
    mippy.put("Me", "hybrid");

    mippy.containsValue("cat");

    System.out.println(mippy.get("Trelvyn"));
    System.out.println(mippy.containsValue("Jim")); // false -- Jim is a Key, not a Value
    System.out.println(mippy.containsKey("Ra"));
    System.out.println(mippy.values());



    Map treeMippy = new TreeMap();
    treeMippy.put("Trelvyn", "cat");
    treeMippy.put("IsIs", "cat");
    treeMippy.put("Ra", "human");
    treeMippy.put("Jim", "human");
    treeMippy.put("Me", "hybrid");

    System.out.println(treeMippy);

  Map linkMippy = new LinkedHashMap();
  linkMippy.put("IsIs", "cat");
  linkMippy.put("Jim", "human");
  linkMippy.put("Me", "hybrid");
  linkMippy.put("Ra", "human");
  linkMippy.put("Trelvyn", "cat");

    System.out.println(linkMippy);


  }
}
