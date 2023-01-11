package ch05.test;

import java.util.Scanner;
public class num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run =true;
        int student = 0;
        int[] scores = null;

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.print("선택>" );
            //숫자 입력받기
            int num = scanner.nextInt();

            if(num==1){
                System.out.print("학생수>");
                student = scanner.nextInt();
                scores = new int[student];
            }else if(num==2){
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("["+i+"]의 점수입력>");
                    scores[i] = scanner.nextInt();
                }
            } else if (num == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("["+i+"]의 점수:"+scores[i]);
                }
            } else if (num == 4) {
                int bestScore=0;
                int totalSum=0;

                for (int i = 0; i < scores.length; i++) {
                    totalSum += scores[i];
                    if(bestScore<scores[i]){
                        bestScore = scores[i];
                    }
                }
                double totalAvg= (double)totalSum/student;
                System.out.println("최고 점수:" + bestScore);
                System.out.println("평균 점수:"+totalAvg);
            } else {
                run =false;
            }
        }
    }
}
