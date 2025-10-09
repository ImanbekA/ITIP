class Audiobook extends Book {
    private double duration;
    private String narrator;
    public Audiobook(String title, String author, int year, double duration, String narrator) {
        super(title, author, year);
        this.duration = duration;
        this.narrator = narrator;
    }
    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    @Override
    public void displayInfo() {
        System.out.println("Аудиокнига: ");
        System.out.println(super.toString());
        System.out.println("Длительность(в часах): " + duration + " ч");
        System.out.println("Рассказчик: " + narrator);
    }
}
