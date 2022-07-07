package 해시셋;

import java.util.HashSet;

public class Main {
    public static void main(String[]args) {
//        HashSet<Integer>set = new HashSet<>();
//
//        while(true) {
//            int val = (int)(Math.random()* 45) + 1;
//            set.add(val);
//            if(set.size() == 6) break;
//        }
//        System.out.println(set);
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C++");
        set.add("Python");
        set.add("Java");

        for(String e : set) {
            System.out.println(e + " ");
        }



    }
}
