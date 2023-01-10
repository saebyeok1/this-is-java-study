package ch04.test;

public class num6 {
    public static void main(String[] args) {

        for(int i=1 ; i<=5; i++) {
            for(int m=1; m<=i; m++){
                System.out.print("*");
                if(i==m){
                    System.out.println();
                }
            }

        }
    }
}
