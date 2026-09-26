package Structural.proxy;

public class RealImage implements Image {
    private final String fileName;
    private String image;

    RealImage(String fileName) {
        this.fileName = fileName;
        // The expensive work happens as soon as the real object exists.
        this.loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk file = " + this.fileName);
        this.image = "image from " + this.fileName;
    }

    @Override
    public void printImage() {
        System.out.println("Printing Image: " + this.image);
    }
}
