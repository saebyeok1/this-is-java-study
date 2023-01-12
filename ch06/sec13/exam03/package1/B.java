package ch06.sec13.exam03.package1; //같은 패키지

public class B {
    public void method() {
        //객체 생성
        A a = new A();

        //필드값 변경
        a.field1 = 1;
        a.field2 = 1;
        //a.field3 = 1; //private 필드 접근 불가(컴파일 에러)

        //메소드 변경
        a.method1();
        a.method2();
        //a.method3(); //private 매소드 접근 불가(컴파일 에러)
    }
}
