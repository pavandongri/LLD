package Creational.abstractfactory;

public class MacFactory implements ComputerFactory {
    @Override
    public VideoPlayer createVideoPlayer() {
        return new MacVideoPlayer();
    }

    @Override
    public PdfReader createPdfReader() {
        return new MacPdfReader();
    }
    
}
