package lesson4;

public class Cat extends Animal {
    final int FOOD_TO_SATIETY = 10;
    private boolean isNotHungry = false;

    public Cat(String name) {
        super(name, 200, -1);
    }

    public void Feed(Plate plate) {
        if (plate.FoodLeft() >= FOOD_TO_SATIETY) {
            plate.ConsumeFood(FOOD_TO_SATIETY);
            isNotHungry = true;
        }
    }

    public boolean IsNotHungry() {
        return isNotHungry;
    }
}
