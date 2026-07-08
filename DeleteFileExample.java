import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File not found or could not be deleted.");
        }
    }
}
