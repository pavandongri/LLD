package behavioural.state;

public enum Product {
    CHIPS(1, "Chips", 150),
    COCA_COLA(2, "Coca Cola", 250),
    NOODLES(3, "Noodles", 300);

    private final int code;
    private final String displayName;
    private final int price;

    Product(int code, String displayName, int price) {
        this.code = code;
        this.displayName = displayName;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public static Product fromCode(int code) {
        for (Product product : values()) {
            if (product.code == code) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return code + ". " + displayName + " - " + price;
    }
}
