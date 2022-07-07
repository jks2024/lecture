package 중첩인터페이스;

public class ButtonEx {
    public static void main(String[]args) {
        Button btn = new Button();
//        btn.setOnClickListener(new CallListener());
//        btn.touch();
//        btn.setOnClickListener(new MessageListener());
//        btn.touch();
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {

            }
        });
    }
}
