package ch09.sec06.exam03;

public class Button {
    //정적 a멤버 인터페이스
    public static interface ClickListener {
        //추상 메소드
        void onClick();
    }

    //필드
    private ClickListener clickListener;

    //메소드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick(); //Button이 클릭되었을 때 실행하는 메소드 선언
    }
}
