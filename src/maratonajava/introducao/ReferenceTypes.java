package maratonajava.introducao;

public class ReferenceTypes {
    public static void main(String[] args) {
        int[] numbers = new int[3]; // or int num[];

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        for (int i = 0; i < 3; i++)
            System.out.println(numbers[i]);

        int[] numbers2 = {1, 2, 3, 4, 5};

        for (int num: numbers2)
            System.out.println(num);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = i + j;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        // with length, you can do enhanced 'for'
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
}
