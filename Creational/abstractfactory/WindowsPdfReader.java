package Creational.abstractfactory;

public class WindowsPdfReader implements PdfReader {
    @Override 
    public void readPdf(String filename) {
        System.out.println("Reading PDF file " + filename + " on Windows");
    }
}
