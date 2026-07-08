import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("sample.txt");
            FileOutputStream output = new FileOutputStream("copy.txt");

            int data;

            while ((data = input.read()) != -1) {
                output.write(data);
            }

            input.close();
            output.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
        }
    }
}
