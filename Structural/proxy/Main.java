package Structural.proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Without proxy: the file is read as soon as the object exists ---");
        Image realImage = new RealImage("images/pic1.png");
        realImage.printImage();

        System.out.println("\n--- With proxy: creating the objects reads nothing ---");
        Image proxyImage1 = new ProxyImage("images/pic1.png");
        Image proxyImage2 = new ProxyImage("images/pic2.png");

        System.out.println("\nFirst call on pic1 loads from disk:");
        proxyImage1.printImage();

        System.out.println("\nSecond call on pic1 reuses the loaded image:");
        proxyImage1.printImage();

        System.out.println("\npic2 is only loaded now, when it is first needed:");
        proxyImage2.printImage();
    }
}
