package ch04.test;

public class num3 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for(i=1;i<=100;i++){
            if (i%3==0){
                sum += i;
            }
        }
        System.out.println("3의 배수의 총합: "+sum);
    }
}
