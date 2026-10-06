import java.io.*;
public class IOStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String data = "This is I/O Stram java program ";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully");
            FileInputStream fis = new FileInputStream("sample.txt");
            int ch;
            System.out.println("Data read from file:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
            System.out.println("\nFile closed successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}