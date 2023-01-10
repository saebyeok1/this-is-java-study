package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while (true){
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);
            if(num==6){
                break; //->프로그램종료
            }
        }
        System.out.println("프로그램 종료");
    }
}
