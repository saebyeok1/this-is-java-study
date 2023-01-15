package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone; /XXXX Phone 객체는 new 생성자로 객체 생성 불가.

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn(); //Phone의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff(); //Phone의 메소드
    }
}
