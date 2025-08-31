import java.util.*;

class ColumnSortMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        // Input matrix
        System.out.println("Enter elements for 3x3 matrix:");
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = sc.nextInt();
            }
        }

        // Sort each column
        for (int col = 0; col < 3; col++) {
            for (int i = 0; i < 2; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (mat[i][col] > mat[j][col]) {
                        // Swap elements in column
                        int temp = mat[i][col];
                        mat[i][col] = mat[j][col];
                        mat[j][col] = temp;
                    }
                }
            }
        }

        // Display sorted matrix
        System.out.println("\nMatrix after sorting columns:");
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // columns
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
