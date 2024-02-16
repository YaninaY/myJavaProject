package lesson6;

public class Matrix {

    // Method to calculate the sum of integers in a 4x4 matrix
    public static int sum(String[][] matrix) throws MyArraySizeException, MyArrayDataException {
        final int arraySize = 4;
        // Check if the matrix is 4x4, throw MyArraySizeException if not
        if (matrix.length != arraySize && matrix[0].length != arraySize) {
            throw new MyArraySizeException("Array size must be 4x4.");
        }

        int sum = 0;
        // Iterate through the matrix and sum its elements
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                try {
                    int value = Integer.parseInt(matrix[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("matrix[" + i + "][" + j + "] does not contain a number");
                }
            }
        }

        return sum;
    }
}
