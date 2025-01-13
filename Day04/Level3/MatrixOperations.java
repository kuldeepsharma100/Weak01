import java.util.Random;

public class MatrixOperations {

    // Method to generate a random matrix with the given number of rows and columns
    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        // Filling the matrix with random values between 1 and 9
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Adding corresponding elements of the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        // Subtracting corresponding elements of the two matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // Ensure multiplication is possible (columns of matrix1 must equal rows of matrix2)
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible due to dimension mismatch.");
            return null;
        }

        int[][] result = new int[rows1][cols2];

        // Performing matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        // Transposing the matrix (rows become columns and vice versa)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Matrix is not 2x2!");
            return 0;
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            System.out.println("Matrix is not 3x3!");
            return 0;
        }

        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Matrix is not 2x2!");
            return null;
        }

        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            System.out.println("Matrix is not 3x3!");
            return null;
        }

        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse.");
            return null;
        }

        double[][] inverse = new double[3][3];

        // Formula for finding inverse of a 3x3 matrix
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) det;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) det;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) det;

        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) det;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) det;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) det;

        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) det;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) det;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Method to display a matrix of doubles (used for inverse matrices)
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Generate random 2x2 and 3x3 matrices
        int[][] matrix2x2 = generateRandomMatrix(2, 2);
        int[][] matrix3x3 = generateRandomMatrix(3, 3);

        // Perform matrix operations
        System.out.println("Matrix 2x2:");
        displayMatrix(matrix2x2);

        System.out.println("Matrix 3x3:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose of Matrix 2x2:");
        displayMatrix(transposeMatrix(matrix2x2));

        System.out.println("\nTranspose of Matrix 3x3:");
        displayMatrix(transposeMatrix(matrix3x3));

        System.out.println("\nDeterminant of 2x2 Matrix: " + determinant2x2(matrix2x2));
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3(matrix3x3));

        System.out.println("\nInverse of 2x2 Matrix:");
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        if (inverse2x2 != null) displayMatrix(inverse2x2);

        System.out.println("\nInverse of 3x3 Matrix:");
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        if (inverse3x3 != null) displayMatrix(inverse3x3);
    }
}
