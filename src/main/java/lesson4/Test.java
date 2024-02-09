package lesson4;

public class Test {
    public static void main(String[] args) {
        testCatsAndDogs();
        testPayments();
        testPark();
    }

    private static void testCatsAndDogs() {
        Animal bobikDog = new Dog("Bobik");
        Animal angiCat = new Cat("Angi");

        bobikDog.run(501);
        bobikDog.run(500);
        bobikDog.swim(11);
        bobikDog.swim(10);

        angiCat.run(200);
        angiCat.run(201);
        angiCat.swim(1);

        Plate plate = new Plate(25);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Angi");
        cats[1] = new Cat("Boris");
        cats[2] = new Cat("Kuzya");

        cats[0].Feed(plate);
        cats[1].Feed(plate);
        cats[2].Feed(plate);

        System.out.println("Is full: " + cats[0].IsNotHungry());
        System.out.println("Is full: " + cats[1].IsNotHungry());
        System.out.println("Is full: " + cats[2].IsNotHungry());
    }

    private static void testPayments() {
        Payment payment = new Payment(2);
        payment.addItem(400, "Milk");
        payment.addItem(100, "Cookies");

        payment.paymentInfo();
    }

    private static void testPark() {
        Park park = new Park(2);
        park.addAttraction("Attraction1", 2, 3.5);
        park.addAttraction("Attraction2", 1, 10);

        park.printInfo();
    }
}
