public abstract class Title {
    protected String title;
    protected String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        this.rate = 1.5; // Assuming a default rate
    }

    public double calculateRoyalty() {
        return copies * rate;
    }

    public abstract double calculatePoints();

    public abstract double calculateLiteraturePoints();
}
