package ch07.sec03.exam01;

public class SmartPhone extends Phone{
    //자식 생성자 선언
    public SmartPhone(String model, String color) {
        super(); //생략 가능 ,컴 파일시 자동 추가
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
