package collectionframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "om");
        map.put(32, "Neha");
        map.put(3, "Shubham");
        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);
        String s =map.get(31);
        System.out.println(s);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("om"));

//        map.keyset is a one method
        for (int i : map.keySet()) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey()+": "+entry.getValue());
//            System.out.println(entry.getValue().toUpperCase());   //it temp toUpperCase
            entry.setValue(entry.getValue().toUpperCase());     //this will set into uppercase
        }
        System.out.println(map);

        map.remove(1);
        System.out.println(map);
       boolean res = map.remove(2,"ankush");
        System.out.println(res);


        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("hitesh",78);
        map2.put("shubham",42);
        map2.put("ankush",42);

//        Set<String> k = map2.keySet();
//        for(String key : k) {
//            System.out.println(key+" "+map2.get(key));
//        }

        map2.remove("hitesh");

        map2.replace("ankush",99);
        map2.put(null,null);
        map2.put("uma",null);

        System.out.println(map2);
// new way
        for (Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey()+" -> "+m.getValue());
        }

//        old way
//        Set set = map2.entrySet();
//        System.out.println(set);
//        Iterator itr = set.iterator();
//        while(itr.hasNext()) {
//            Map.Entry entry = (Map.Entry)itr.next();
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//        }
    }
}
