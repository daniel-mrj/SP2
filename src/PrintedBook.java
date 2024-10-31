public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        return pages * 0.2;
    }

    @Override
    public double calculateLiteraturePoints() {
        return pages * 0.1;
    }
}
