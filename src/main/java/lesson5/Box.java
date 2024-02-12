package lesson5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void moveAll(Box<T> destination) {
        for (int i = 0; i < fruits.size(); i++) {
            destination.addFruit(fruits.get(i));
        }

        fruits.clear();
    }

    public float getWeight() {
        float weight = 0;
        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }

        return weight;
    }

    public <TFruit extends Fruit> boolean compare(Box<TFruit> box) {
        return this.getWeight() == box.getWeight();
    }
}
