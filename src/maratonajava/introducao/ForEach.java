package maratonajava.introducao;

public class ForEach {
    public static void main(String[] args) {
        int[] others = new int[10];

        for (int i = 0; i < others.length; i++) {
            others[i] = 3 * (i + 1);
        }

        for (int num : others) {
            System.out.println(num);
        }

        //  The code above works the same way as the code below:
        // .    for (int i = 0; i < others.length; i++) {
        // .        int num = others[i];
        // .        System.out.println(num);
        // .    }

        int[][] test = new int[3][2];

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = j + 1;
            }
        }

        for (int[] arrBase : test) {
            for (int each : arrBase) {
                System.out.println(each);
            }
        }

        //  The code above works the same way as the code below:
        // .    for (int i = 0; i = test.length; i++) {
        // .        int[] arrBase = test[i];
        // .        for (int j = 0; j = arrBase.length; j++) {
        // .            int each = arrBase[j];
        // .            System.out.println(each);
        // .        }
        // .    }
    }
}
