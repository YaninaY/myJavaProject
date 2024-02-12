package lesson5;

public class Test {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());

        appleBox1.moveAll(appleBox2);
        System.out.println("After moving from box1 to box2: ");
        System.out.println("appleBox1 weight: " + appleBox1.getWeight());
        System.out.println("appleBox2 weight: " + appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        System.out.println("orangeBox weight: " + orangeBox.getWeight());
        System.out.println("appleBox2 == orange: " + appleBox2.compare(orangeBox));
    }
}
