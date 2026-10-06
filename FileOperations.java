import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            // 1. Creating a file
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // 2. Opening the file
            FileReader fr = new FileReader(file);
            System.out.println("File opened successfully.");

            // 3. Reading the file
            int ch;
            System.out.println("File contents: Helloooo Welcome to java lab.....");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            // 4. Closing the file
            fr.close();
            System.out.println("\nFile closed successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}