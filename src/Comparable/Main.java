package Comparable;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[]args) {
        TreeSet<CarComp> arrList = new TreeSet<>();
        arrList.add(new CarComp("싼타페", 2016, "흰색"));
        arrList.add(new CarComp("쏘렌토", 2012, "은색"));
        arrList.add(new CarComp("그랜저", 2018, "은색"));

        Iterator<CarComp> iterator = arrList.iterator();
        while(iterator.hasNext()) {
            CarComp car = iterator.next();
            System.out.println(car.modelName + ":" + car.modelYear);
        }
    }
}
