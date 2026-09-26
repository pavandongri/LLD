package behavioural.template;

abstract class DataProcessor {

    private final String file;

    public DataProcessor(String file) {
        this.file = file;
    }

    // Template method: final so subclasses cannot change the order of steps
    public final void process() {
        readData();
        processData();
        analyzeData();
        displayData();
        if (shouldSave()) {
            saveData();
        }
    }

    protected String getFile() {
        return file;
    }

    // ---- steps that differ per format: subclasses must implement ----

    protected abstract void readData();

    protected abstract void processData();

    // ---- steps shared by every format ----

    protected void analyzeData() {
        System.out.println("Analysing data from " + file);
    }

    protected void displayData() {
        System.out.println("Displaying data from " + file);
    }

    protected void saveData() {
        System.out.println("Saving data from " + file);
    }

    // ---- hook: optional step, subclasses may override ----

    protected boolean shouldSave() {
        return true;
    }
}
