import java.io.IOException;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
    
    public static void throwCheckedException() throws IOException {
        throw new IOException("This is a checked exception.");
    }
}
