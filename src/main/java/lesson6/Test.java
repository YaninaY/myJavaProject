package lesson6;

public class Test {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arr1 = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        // Pass parsable matrix
        test(arr1);

        // Pass array with incorrect size
        String[][] arr2 = {
                {"1", "2", "2"},
                {"2", "3", "4"}
        };
        test(arr2);

        // Pass array with correct size and unparsable value
        arr1[1][2] = "Not a number";
        test(arr1);
    }

    private static void test(String[][] array) {
        try {
            Matrix matrix = new Matrix();
            int result = matrix.sum(array);
            System.out.println("Result: " + result);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
