package Structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite: derives its size from its children and displays them recursively.
 * add/remove live here rather than on FileSystem so a File can never receive them.
 */
public class Folder implements FileSystem {
    private final String name;
    private final List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileSystem child : children) {
            size += child.getSize();
        }
        return size;
    }

    @Override
    public void display(String prefix) {
        System.out.println(prefix + "> " + name + ", Size: " + getSize());
        for (FileSystem child : children) {
            child.display(prefix + "----");
        }
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    public boolean remove(FileSystem fileSystem) {
        return children.remove(fileSystem);
    }
}
