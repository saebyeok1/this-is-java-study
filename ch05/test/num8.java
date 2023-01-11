package ch05.test;

public class num8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int totalSum=0;
        int totalCount=0;

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                totalSum += array[i][k];
                totalCount++;
            }
        }

        double totalAvg=(double)totalSum/totalCount;

        System.out.println("전체 합:"+totalSum);
        System.out.println("전체 평균:"+totalAvg);

    }
}
