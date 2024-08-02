import java.sql.Array;

public class MyArray {

    public static void main(String[] args) {
        int[] numbers;
        String[] names;

        numbers = new int[4];
        names = new String[4];

        numbers[0]=1;
        numbers[3]=7;
        numbers[3]=1;
        numbers = new int[]{1, 3, 4, 5};
        System.out.println(numbers[3]);
        for (int i =0; i<numbers.length ; i++){
            System.out.println("print"+numbers[i]);
        }

//multidimensional array
        int[][] numberMatrix = new int[5][3];
        numberMatrix[0][0] = 1;
        numberMatrix[0][1] = 2;
        numberMatrix[1][2] = 5;
        numberMatrix[1][1] = 8;
        numberMatrix[2][2] = 1;
        numberMatrix[3][1] = 2;
        numberMatrix[4][2] = 5;
        numberMatrix[1][2] = 7;
        System.out.println(numberMatrix.length);
        System.out.println(numberMatrix[1][2]);
        // Accessing elements and iterating over the matrix
        System.out.println("Matrix elements:");
        for (int i = 0; i < numberMatrix.length; i++) {
            for (int j = 0; j < numberMatrix[i].length; j++) {
                System.out.print(numberMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
