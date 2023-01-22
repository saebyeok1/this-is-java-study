package ch12.sec04;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //i값 출력
            System.out.println(i);
            if (i == 5) {
                //JVM프로그램종료
                System.out.println("프로세스 강제종료");
                System.exit(0);
            }
        }
    }
}
