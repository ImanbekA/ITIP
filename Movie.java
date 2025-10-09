class Movie extends Book {
    private String director;
    private double duration;
    public Movie(String title, String author, int year, String director, double duration) {
        super(title, author, year);
        this.director = director;
        this.duration = duration;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    @Override
    public void displayInfo() {
        System.out.println("Фильм: ");
        System.out.println(super.toString());
        System.out.println("Режиссер: " + director);
        System.out.println("Длительность(в часах): " + duration + " ч");    }
}
