package ch04.sec06;

import java.util.Scanner;
public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String inputString;
        
        do{
            System.out.println(">");
            inputString = scanner.nextLine(); //키보드로부터 읽기
            System.out.println(inputString);
        }while ( ( ! inputString.equals("q")));//입력된 내용이 q가 아니라면 게속 반복

        System.out.println();
        System.out.println("프로그램 종료");
    }
    
}
