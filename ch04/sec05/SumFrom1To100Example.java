package ch04.sec05;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1; //카운터 변수

        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1~"+(i-1)+"합: "+sum);
    }
}
