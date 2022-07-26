package 게임만들기;

public class ThreadB extends Thread {
    private Character warrior;
    private Character wizard;
    ThreadB(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    @Override
    public void run() {
        int normal, special;
        while(true) {
            try {
                sleep(3300);
                boolean endGame = false;
                normal = (int)(Math.random() * 2);
                special = (int)(Math.random() * 18);
                if(normal == 1) {
                    System.out.println("물리 공격 : " + warrior.name + " 에게 " + wizard.pAttack() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                } else {
                    System.out.println("마법 공격 : " + warrior.name + " 에게 " + wizard.mAttack() + " 데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.pAttack());
                }
                if(special == 14) {
                    System.out.println(wizard.name + " 궁극기 발동 !!, " + warrior.name + "에게" + wizard.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if(endGame) System.exit(0);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
