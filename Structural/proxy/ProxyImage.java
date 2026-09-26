package Structural.proxy;

public class ProxyImage implements Image {
    private final String fileName;
    private RealImage realImage;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printImage() {
        // The real subject is created on first use and reused afterwards,
        // so constructing a proxy costs nothing.
        if (this.realImage == null) {
            this.realImage = new RealImage(this.fileName);
        }
        this.realImage.printImage();
    }
}
