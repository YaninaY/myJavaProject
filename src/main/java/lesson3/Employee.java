package lesson3;

// Create a class "Employee" with the fields: full name, position, email, phone, salary, age.
// The class constructor must fill in these fields when creating the object.
// Inside the “Employee” class, write a method that displays information about the object to the console.
// Create an array of 5 employees and display information only about employees over 40 years old.
public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phone;
    public Double salary;
    public Short age;

    public Employee(String fullName, String position, String email, String phone, Double salary, Short age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
