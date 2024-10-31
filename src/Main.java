public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Johnsen");

        AudioBook audioBook = new AudioBook("AudioBook Title", "Fiction", 10, 120);
        PrintedBook printedBook = new PrintedBook("PrintedBook Title", "Non-Fiction", 5, 300);

        author.addTitle(audioBook);
        author.addTitle(printedBook);

        System.out.println("Total Royalty: " + author.calculateTotalPay());
        System.out.println("AudioBook Points: " + audioBook.calculatePoints());
        System.out.println("PrintedBook Points: " + printedBook.calculatePoints());
    }
}
