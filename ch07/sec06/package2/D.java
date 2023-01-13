package ch07.sec06.package2;

import ch07.sec06.package1.A;
import ch07.sec06.package1.A.*;

public class D extends A {
    //생성자 선언
    public D() {
        //A() 생성자 호출
        super();
    }

    //메소드 선언 //상속을 해서 물려 받은 것
    public void method1() {
        //A 필드값 변경
        this.field = "value";
        //A 메소드 호출
        this.method();
    }
    /* 상속과 관계 없이 외부에서 A를 사용하는 코드라 안됨 
    //메소드 선언
    public void method2() {
        A a = new A();
        a.field = "value";
        a.method();
    }
     */
}

