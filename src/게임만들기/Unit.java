package 게임만들기;

public class Unit {
    protected String name;
    protected int pPower;
    protected int mPower;
    protected double pHit;
    protected double mHit;
    protected int ultraPower;
    int hp;
};

interface GameAction {
    double pAttack();
    double mAttack();
    int ultimate();
    boolean setDamage(double damage);
}

class Character extends Unit implements GameAction {
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name;
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }

    @Override
    public double pAttack() {
        return pPower * pHit;
    }

    @Override
    public double mAttack() {
        return mPower * mHit;
    }

    @Override
    public int ultimate() {
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다.");
            return false;
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료 합니다.");
            return true;
        }
    }

    public synchronized void methodA() {
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
    public synchronized void methodB() {
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }


}