package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        //Box<String> box1 = new Box<String>();
        Box<String> box1 = new Box<>(); //Box를 생성할 때 타입 파라미터 T대신 String으로 대체
        box1.content = "안녕하세요"; //Box를 생성할 때 타입 파라미터 T대신 String으로 대체
        String str = box1.content; //Box를 생성할 때 타입 파라미터 T대신 String으로 대체
        System.out.println(str); //Box를 생성할 때 타입 파라미터 T대신 String으로 대체

        //Box<Integer> box1 = new Box<Integer>();
        Box<Integer> box2 = new Box<>(); //Box를 생성할 때 타입 파라미터 T대신 Integer로 대체
        box2.content = 100; //Box를 생성할 때 타입 파라미터 T대신 String으로 대체
        int value = box2.content; //Box를 생성할 때 타입 파라미터 T대신 String으로 대체
        System.out.println(value);

    }
}
