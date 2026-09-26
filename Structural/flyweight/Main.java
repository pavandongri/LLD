package Structural.flyweight;

public class Main {
    public static void main(String[] args) {
        TreeType bananaTreeType = TreeTypeFactory.getTreeType("banana", "green", 100, 100);

        Tree bananaTree1 = new Tree(1, 1, bananaTreeType);
        Tree bananaTree2 = new Tree(2, 2, bananaTreeType);

        bananaTree1.display();
        bananaTree2.display();

        TreeType mangoTreeType = TreeTypeFactory.getTreeType("mango", "green", 100, 100);

        Tree mangoTree1 = new Tree(3, 3, mangoTreeType);
        Tree mangoTree2 = new Tree(4, 4, mangoTreeType);

        mangoTree1.display();
        mangoTree2.display();

        // Asking for the same intrinsic state again returns the very same object.
        TreeType bananaAgain = TreeTypeFactory.getTreeType("banana", "green", 100, 100);
        System.out.println("\nSame banana flyweight reused: " + (bananaAgain == bananaTreeType));
        System.out.println("4 trees on screen, but only "
                + TreeTypeFactory.cachedTypeCount() + " TreeType objects in memory.");
    }
}
