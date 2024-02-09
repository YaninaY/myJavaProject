package lesson4;

public class Park {
    private int maxAttractions;
    private Attraction[] attractions;

    public Park(int maxAttractions) {
        this.maxAttractions = 0;
        this.attractions = new Attraction[maxAttractions];
    }

    public void addAttraction(String name, int workTime, double price) {
        if (maxAttractions < attractions.length) {
            attractions[maxAttractions] = new Attraction(name, workTime, price);
            maxAttractions++;
        }
    }

    public void printInfo() {
        for (int i = 0; i < maxAttractions; i++) {
            System.out.println("Name: " + attractions[i].getNameAttraction()
                + ", Work time: " + attractions[i].getWorkTime()
                + ", Price: " + attractions[i].getPrice() + "$");
        }
    }

    public static class Attraction {
        private String nameAttraction;
        private int workTime;
        private double price;

        public Attraction(String nameAttraction, int workTime, double price) {
            this.nameAttraction = nameAttraction;
            this.workTime = workTime;
            this.price = price;
        }

        public String getNameAttraction() {
            return nameAttraction;
        }

        public int getWorkTime() {
            return workTime;
        }

        public double getPrice() {
            return price;
        }
    }
}