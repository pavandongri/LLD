package behavioural.template;

public class CsvProcessor extends DataProcessor {

    public CsvProcessor(String file) {
        super(file);
    }

    @Override
    protected void readData() {
        System.out.println("Reading csv data from " + getFile());
    }

    @Override
    protected void processData() {
        System.out.println("Splitting csv rows by comma from " + getFile());
    }
}
