package lesson3;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Ivanov Vitaliy Pavlovich",
                "Trainee auto QA",
                "ivanov@gmail.com",
                "+48123456789",
                5000.0,
                (short)27);
        employees[1] = new Employee(
                "Sidarov Vitaliy Pavlovich",
                "Trainee auto QA",
                "vitaliy@gmail.com",
                "+48789345678",
                3900.0,
                (short)40);
        employees[2] = new Employee(
                "Shishova Anna Pavlovna",
                "Trainee auto QA",
                "anna@gmail.com",
                "+48094567234",
                3700.0,
                (short)41);
        employees[3] = new Employee(
                "Golovkova Galina Pavlovna",
                "Trainee auto QA",
                "galina@gmail.com",
                "+48678124567",
                6000.0,
                (short)75);
        employees[4] = new Employee(
                "Feschenko Yanina Viacheslavovna",
                "Trainee auto QA",
                "yanina@gmail.com",
                "+48567098234",
                4500.0,
                (short)22);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].info();
            }
        }
    }
}
