package ch08.sec12;

public class Bus implements Vehicle {
    //추상 메소드 재정의
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }

    public void checkFare() {
        System.out.println("승차 요금을 체크합니다.");
    }
}
