package ch05.test;

public class num7 {
    public static void main(String[] args) {
        int maxValue = 0;
        int[] array = {1, 5, 3, 8, 2};
        for (int i = 0; i < array.length; i++) {
            if (maxValue<array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);
    }
}
