package lesson4;

public class Payment {
    private int countProducts;
    private Item[] items;

    public Payment(int maxProducts) {
        this.countProducts = 0;
        this.items = new Item[maxProducts];
    }

    public void addItem(int price, String name) {
        if (countProducts < items.length) {
            items[countProducts] = new Item(price, name);
            countProducts++;
        }
    }

    public void paymentInfo() {
        for (int i = 0; i < countProducts; i++) {
            System.out.println("Name: " + items[i].getProductName() + ", Price: " + items[i].getPrice());
        }
    }

    public class Item {
        private int price;
        private String productName;

        public Item(int price, String productName) {
            this.price = price;
            this.productName = productName;
        }

        public int getPrice() {
            return price;
        }

        public String getProductName() {
            return productName;
        }
    }
}
