package Structural.flyweight;

public class Tree {
    // Extrinsic state: unique per tree, so it stays outside the flyweight.
    private final int posX;
    private final int posY;
    private final TreeType treeType;

    Tree(int posX, int posY, TreeType treeType) {
        this.posX = posX;
        this.posY = posY;
        this.treeType = treeType;
    }

    public void display() {
        System.out.println("Tree at (" + this.posX + "," + this.posY + ")"
                + " name=" + this.treeType.getName()
                + " , color=" + this.treeType.getColor()
                + " , height=" + this.treeType.getHeight()
                + " , width=" + this.treeType.getWidth());
    }
}
