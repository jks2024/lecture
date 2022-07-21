package 사용자정의예외클래스;

public class CheckEven {
    private int num;
    public void setNum(int num) { this.num = num;
    }
    public int printEven(int number) throws EvenException {
        this.num = number;
        if(num % 2 != 0) {
            throw new EvenException(num);
        }else{
            return num;
        }
    }
}
