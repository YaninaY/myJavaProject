package lesson2;

// Task 4
// Write a method that is passed a string and a number as arguments,
// the method must print the specified string to the console, the specified number of times
public class PrintString {
    public static void main(String[] args){
        printString("hello, world", 2);
    }

    public static void printString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
