package lesson4;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void ConsumeFood(int amount) {
        if (amount > foodCount) {
            foodCount = 0;
        } else {
            foodCount -= amount;
        }
    }

    public void AddFood(int amount) {
        foodCount += amount;
    }

    public int FoodLeft() {
        return foodCount;
    }
}
