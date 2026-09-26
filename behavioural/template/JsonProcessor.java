package behavioural.template;

public class JsonProcessor extends DataProcessor {

    public JsonProcessor(String file) {
        super(file);
    }

    @Override
    protected void readData() {
        System.out.println("Reading json data from " + getFile());
    }

    @Override
    protected void processData() {
        System.out.println("Parsing json objects from " + getFile());
    }

    // JSON source is treated as read-only, so skip the save step
    @Override
    protected boolean shouldSave() {
        return false;
    }
}
