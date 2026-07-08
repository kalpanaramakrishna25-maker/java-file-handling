import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWordsInFile {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            Scanner sc = new Scanner(file);

            int wordCount = 0;

            while (sc.hasNext()) {
                sc.next();
                wordCount++;
            }

            sc.close();

            System.out.println("Total words in file = " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
