package lesson2;

// Task 8
// Create a square two-dimensional integer array (the number of rows and columns is the same),
// and use a loop(s) to fill its diagonal elements with units (you can only use one of the diagonals
// if both are complex). The elements of one of the diagonals can be determined according
// to the following principle: the indices of such elements are equal, that is, [0][0], ..., [n][n]
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        Diagonal(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
    }
}
