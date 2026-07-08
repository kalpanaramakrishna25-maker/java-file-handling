import java.io.FileWriter;
import java.io.IOException;

public class AppendFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt", true);

            writer.write("\nThis line is appended to the file.");

            writer.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
        }
    }
}
