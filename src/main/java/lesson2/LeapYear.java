package lesson2;

// task 4*
// Write a method that determines whether one year is a leap year and returns
// a boolean value (leap year is true, non-leap year is false).
// Every 4th year is a leap year, except every 100th, while every 400th is a leap year.
public class LeapYear {
    public static void main(String[] args){
        System.out.println(leap(404));
    }

    public static boolean leap(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
