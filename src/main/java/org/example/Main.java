import org.example.CopyFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));

        ArrayList<Integer> result = CopyFinder.search(list1,list2);
        System.out.println(result);
    }
}