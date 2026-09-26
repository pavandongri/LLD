package Structural.composite;

public class Main {
    public static void main(String[] args) {
        FileSystem file1 = new File("file1.txt", 100);
        FileSystem file2 = new File("file2.txt", 200);
        FileSystem file3 = new File("file3.txt", 300);
        FileSystem file4 = new File("file4.txt", 400);
        FileSystem file5 = new File("file5.txt", 500);
        FileSystem file6 = new File("file6.txt", 600);

        Folder folder1 = new Folder("folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("folder2");
        folder2.add(file3);
        folder2.add(file4);
        folder1.add(folder2);

        
        Folder folder3 = new Folder("folder3");
        folder3.add(file5);
        folder3.add(file6);
        folder2.add(folder3);

        folder1.display("|-");
    }
}
