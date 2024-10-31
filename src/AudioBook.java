public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        return durationInMinutes * 0.1;
    }

    @Override
    public double calculateLiteraturePoints() {
        return durationInMinutes * 0.05;
    }
}
