package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        //A 객체 생성
        A a = new A();

        //B 객체 생성
        A.B b = a.new B();

    }
}
