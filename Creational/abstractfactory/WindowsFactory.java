package Creational.abstractfactory;

public class WindowsFactory implements ComputerFactory {
    @Override 
    public VideoPlayer createVideoPlayer() {
        return new WindowsVideoPlayer();
    }  

    @Override 
    public PdfReader createPdfReader() {
        return new WindowsPdfReader();
    }
}
