package 게임만들기;

import 싱글톤.Singleton;

public class ThirdTh extends Unit implements Runnable{
    Singleton obj1 = Singleton.getSingleton();
    @Override
    public void run() {
        characterInfo();
        while(true)  {
            try {
                Thread.sleep(1000);
                System.out.println("Thread Thread Call");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ThirdTh(String name, int type, int pPower, int mPower, double pHit, double mHit, int hp) {
        this.name = name;
        this.type = type;
        this.pPower = pPower;
        this.mPower = mPower;
        this.pHit = pHit;
        this.mHit = mHit;
        this.hp = hp;
    }

    double pAttack() {
        return pPower * pHit;
    }
    double mAttack() {
        return mPower * mHit;
    }
    void characterInfo() {
        String[] typeStr = {"", "탱커", "근접 딜러", "원거리 딜러", "힐러"};
        System.out.println("이름 : " + name);
        System.out.println("타입 : " + typeStr[type]);
        System.out.printf("물리 공격력 : %.2f\n", pAttack());
        System.out.printf("마법 공격력 : %.2f\n", mAttack());

    }
}
