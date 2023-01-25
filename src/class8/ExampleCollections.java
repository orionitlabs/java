package class8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleCollections{

    public static void main(String args[]) {

        //List
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("2");
        al.add("3");
        al.add("3");

        System.out.println("List Elements : "+ al);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            if(itr.next() == "2")
                itr.remove();
        }
        System.out.println("Output using the Iterator : "+ al);

        al.clear();
        al.add("1");
        al.add("2");
        al.add("2");
        al.add("3");
        al.add("3");

        System.out.println("List Elements : "+ al);
        for(int i = 0; i < al.size(); i++) {
            if (al.get(i) == "2") {
                al.remove(i);
            }
        }
        System.out.println("Output using the for loop : "+ al);

        //Set
        Set<String> set = new HashSet<>();
        Set<String> setl = new LinkedHashSet<>();

        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        System.out.println("Set:" + set);

        //Map
        Map<String, String> mapk = new HashMap();
        mapk.put("121", "Test1");
        mapk.put("123", "Test2");
        mapk.put("123", "valuer");
        mapk.put("124", "Test3");

        Set<Map.Entry<String, String>> entrySet = mapk.entrySet();

        Iterator itrmap = entrySet.iterator();

        while (itrmap.hasNext()) {
            Map.Entry entry = (Map.Entry) itrmap.next();
            System.out.print("Key : "+ entry.getKey()+"     ");
            System.out.print("Value :" + entry.getValue());
            System.out.println();
        }
    }
}
