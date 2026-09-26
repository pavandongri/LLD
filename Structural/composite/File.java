package Structural.composite;

/** Leaf: has a size of its own and no children. */
public class File implements FileSystem {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + "> " + name + ", Size: " + size);
    }
}
