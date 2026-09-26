package Structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    // The cache is shared by everyone, so there is nothing to instantiate.
    private TreeTypeFactory() {
    }

    public static TreeType getTreeType(String name, String color, int height, int width) {
        // The separator keeps ("a", "b", 1, 11) from colliding with ("a", "b", 11, 1).
        String key = name + "|" + color + "|" + height + "|" + width;
        return treeTypes.computeIfAbsent(key, k -> new TreeType(name, color, height, width));
    }

    public static int cachedTypeCount() {
        return treeTypes.size();
    }
}
