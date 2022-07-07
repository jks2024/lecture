package Comparable;

public class CarComp implements Comparable<CarComp>{
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarComp obj) {
        if(this.modelYear == obj.modelYear) return 0;
        else if(this.modelYear < obj.modelYear) return -1;
        else return 1;
    }
}
