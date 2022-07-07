package 이터레이터;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lnkList = new LinkedList<Integer>();
        lnkList.add(4);
        lnkList.add(2);
        lnkList.add(3);
        lnkList.add(1);

//        Iterator<Integer> iter = lnkList.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }
        for(int e : lnkList) {
            System.out.print(e + " ");
        }
    }
}
