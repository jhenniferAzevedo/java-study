package test;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[][] test = new int[3][3];

        for (int i = 0; i < test.length; i++) {
            Arrays.fill(test[i], i + 1);
        }

        for (int[] arrBase : test) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        //  The code above works the same way as the code below:
        int[] arrBase = new int[test.length];
        for (int i = 0; i < test.length; i++) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
