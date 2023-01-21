package class6.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(1);
//        System.out.println(integers.size());

        List<Integer> listIntegers = new ArrayList<>();
        listIntegers.add(1);
        listIntegers.add(1);
//        System.out.println(listIntegers.size());

        for (Integer integer: integers) {
            System.out.println(integer);
        }
        System.out.println("End");
        for (Integer integer: listIntegers) {
            System.out.println(integer);
        }

        //add() -- for adding, remove -- for deleting or removing, get(index) -- will return that value of index, size() -- return size of the list
        // Note: Set collection type do not have set(index, Object) method
    }
}
