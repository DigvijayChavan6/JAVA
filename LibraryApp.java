class Library {
    public void checkoutBook(String bookTitle, boolean isAvailable) throws BookAlreadyCheckedOutException {
        if (!isAvailable) {
            throw new BookAlreadyCheckedOutException("The book '" + bookTitle + "' is already checked out.");
        }
        // Continue with the checkout process
    }
}

class BookAlreadyCheckedOutException extends Exception {
    public BookAlreadyCheckedOutException(String message) {
        super(message);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.checkoutBook("Java Programming", false); // Throws BookAlreadyCheckedOutException
        } catch (BookAlreadyCheckedOutException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
