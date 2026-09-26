package Structural.flyweight;

// Intrinsic state: shared by every tree of this type, so it is immutable.
public class TreeType {
    private final String name;
    private final String color;
    private final int height;
    private final int width;

    TreeType(String name, String color, int height, int width) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
