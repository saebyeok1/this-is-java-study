package ch04.test;

import java.util.Scanner;
public class num7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); //scanner 생성
        boolean bank = true;
        int sum = 0;

        while(bank){
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.println("선택>" );

            int num = scanner.nextInt();

            if(num==1){
                System.out.println("예금액>");
                sum += scanner.nextInt();
            }else if (num==2){
                System.out.println("출금액>") ;
                sum -= scanner.nextInt();
            }else if(num==3){
                System.out.println("잔고>");
                System.out.println(sum);
            }else if(num==4) {
                bank = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
