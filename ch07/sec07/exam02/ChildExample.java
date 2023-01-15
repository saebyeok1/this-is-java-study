package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        //자식 객체 생성
        Child child = new Child();

        //자동 타입 변환
        Parent parent = child;

        //메소드 호출
        parent.method1();
        parent.method2();
        //parent.method3(); (호출 불가능)
    }
}
