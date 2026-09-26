package behavioural.template;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor;

        System.out.println("=== JSON ===");
        processor = new JsonProcessor("students.json");
        processor.process();

        System.out.println("\n=== CSV ===");
        processor = new CsvProcessor("Employees.csv");
        processor.process();
    }
}
