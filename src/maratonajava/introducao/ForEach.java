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
        // .    int num;
        // .    for (int i = 0; i < others.length; i++) {
        // .        num = others[i];
        // .        System.out.println(num);
        // .    }

        int[][] test = new int[3][3];

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                test[i][j] = j + 1;
            }
        }

        for (int[] arrBase : test) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }

        //  The code above works the same way as the code below:
        // .    int[] arrBase = new int[test.length];
        // .    for (int i = 0; i = test.length; i++) {
        // .        int num;
        // .        for (int j = 0; j = arrBase.length; j++) {
        // .            num = arrBase[j];
        // .            System.out.println(num);
        // .        }
        // .    }
    }
}
