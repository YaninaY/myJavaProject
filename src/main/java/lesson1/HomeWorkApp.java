package lesson1;

public class HomeWorkApp {    // Task 1 create class HomeWorkApp and add method main //
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {  // Task 2 add method printThreeWords and output 3 words: Orange, Banana, Apple //
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { // Task 3 add method checkSumSign and declare 2 variables //
        int a = 3;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() { // Task 4 add method printColor and declare a variable int value //
        int value = 1;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() { // Task 5 add method compareNumbers and declare 2 int variables a and b //
        int a = 2;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}