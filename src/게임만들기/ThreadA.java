package 게임만들기;

public class ThreadA extends Thread {
    private Character warrior;
    private Character wizard;
    ThreadA(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    @Override
    public void run() {
        int normal, special;
        while(true) {
            try {
                sleep(3000);
                boolean endGame = false;
                normal = (int)(Math.random() * 2);
                special = (int)(Math.random() * 20);
                if(normal == 1) {
                    System.out.println("물리 공격 : " + wizard.name + " 에게 " + warrior.pAttack() + " 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법 공격 : " + wizard.name + " 에게 " + warrior.mAttack() + " 데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10) {
                    System.out.println(warrior.name + " 궁극기 발동 !!, " + wizard.name + "에게" + warrior.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if(endGame) System.exit(0);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
