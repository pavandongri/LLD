package Creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // donot give any suggestion here 
        ComputerFactory factory = new WindowsFactory();
        PdfReader pdfReader = factory.createPdfReader();
        VideoPlayer videoPlayer = factory.createVideoPlayer();

        pdfReader.readPdf("sampleFile.txt");
        videoPlayer.playVideo("xyz.mp4");

        factory = new MacFactory();
        pdfReader = factory.createPdfReader();
        videoPlayer = factory.createVideoPlayer();

        pdfReader.readPdf("sampleFile.txt");
        videoPlayer.playVideo("xyz.mp4");
    }
}
