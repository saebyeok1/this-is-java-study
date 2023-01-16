package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        //RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();
        //RemoteControl 인터페이스 변수된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();

        //RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();
        //RemoteControl 인터페이스 변수된 추상 메소드만 호출 가능
        searchable.search("http://www.youtube.com");
    }
}
