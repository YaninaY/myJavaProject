package lesson4;

public class Animal {
    private final String name;
    private int maxRunDistance;
    private int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance >= 0 && distance <= maxRunDistance) {
            System.out.println(name + " run " + distance + "m.");
        } else {
            System.out.println(name + " can't run " + distance + "m distance.");
        }
    }

    public void swim(int distance) {
        if (distance >= 0 && distance <= maxSwimDistance) {
            System.out.println(name + " swim " + distance + "m.");
        } else {
            System.out.println(name + " can't swim " + distance + "m distance.");
        }
    }
}
