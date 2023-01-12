package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car mycar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("모델명: "+ mycar.model);
        System.out.println("시동여부: "+ mycar.start);
        System.out.println("현재속도: "+ mycar.speed);
    }
}
