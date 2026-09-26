package Structural.composite;

/** Component: what leaves and composites both look like to a client. */
public interface FileSystem {
    int getSize();

    void display(String prefix);

    /** Convenience entry point so callers need not invent a prefix. */
    default void display() {
        display("");
    }
}
