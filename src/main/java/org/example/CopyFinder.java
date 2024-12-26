package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class CopyFinder {
    public static ArrayList<Integer> search(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        HashSet<Integer> hash = new HashSet<Integer>(list1);
        HashSet<Integer> a = new HashSet<Integer>();
        for (int num : list2) {
            if (hash.contains(num)) {

                a.add(num);
            }
        }


        return new ArrayList<>(a);
    }

}
