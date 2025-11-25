import java.util.*;

class LibrarySystem {

    // 1. Array of available books
    private String[] availableBooks;
    private int bookCount;

    // 2. Queue of students waiting for books
    private Queue<String> waitingQueue = new LinkedList<>();

    // 3. Stack for borrowing history
    private Stack<String> borrowHistory = new Stack<>();

    // 4. Linked list for active borrowers
    private LinkedList<String> activeBorrowers = new LinkedList<>();


  
    public LibrarySystem(String[] initialBooks) {
        availableBooks = new String[initialBooks.length];
        bookCount = initialBooks.length;
        System.arraycopy(initialBooks, 0, availableBooks, 0, initialBooks.length);
    }


    // DISPLAY AVAILABLE BOOKS
    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books:");
        if (bookCount == 0) {
            System.out.println("No books available");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + availableBooks[i]);
        }
    }


    // ISSUE BOOK
    public void issueBook(String book, String student) {

        // search if book is available
        int index = -1;
        for (int i = 0; i < bookCount; i++) {
            if (availableBooks[i].equalsIgnoreCase(book)) {
                index = i;
                break;
            }
        }

        // book found → issue it
        if (index != -1) {
            System.out.println("\nBook issued to: " + student);

            // push into stack
            borrowHistory.push(book);

            // add student to active borrowers
            activeBorrowers.add(student);

            // remove from array (shift left)
            for (int i = index; i < bookCount - 1; i++) {
                availableBooks[i] = availableBooks[i + 1];
            }
            bookCount--;

        } else {
            // not available → enqueue student
            System.out.println("\nBook not available → Student added to waiting list: " + student);
            waitingQueue.add(student);
        }
    }


    // RETURN BOOK
    public void returnBook() {
        if (borrowHistory.isEmpty()) {
            System.out.println("\nNo borrowing history available.");
            return;
        }

        // get last borrowed book
        String returnedBook = borrowHistory.pop();
        System.out.println("\nBook returned: " + returnedBook);

        // add book back to available array
        availableBooks[bookCount] = returnedBook;
        bookCount++;

        // if students waiting → issue immediately
        if (!waitingQueue.isEmpty()) {
            String nextStudent = waitingQueue.poll();
            System.out.println("Issuing to waiting student: " + nextStudent);
            issueBook(returnedBook, nextStudent);
        }
    }


    // DISPLAY ALL STRUCTURES
    public void displayAll() {
        System.out.println("\n===== CURRENT SYSTEM STATE =====");

        displayAvailableBooks();

        System.out.println("\nWaiting Queue: " + waitingQueue);

        System.out.println("\nBorrow History (Stack): " + borrowHistory);

        System.out.println("\nActive Borrowers (Linked List): " + activeBorrowers);
    }


    // MAIN
    public static void main(String[] args) {

        String[] books = {"Java Basics", "DSA in C++", "Python Handbook", "Operating Systems"};

        LibrarySystem lib = new LibrarySystem(books);

        System.out.println("Initial Books:");
        lib.displayAvailableBooks();

        // Demo actions
        lib.issueBook("Java Basics", "Ali");
        lib.issueBook("Java Basics", "Ahmed");
        lib.issueBook("Python Handbook", "Sara");

        lib.displayAll();

        lib.returnBook();

        lib.displayAll();
    }
}
