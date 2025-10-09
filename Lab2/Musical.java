class Musical extends Book {
    private String composer;
    private String leadPerformer;
    public Musical(String title, String author, int year, String composer, String leadPerformer) {
        super(title, author, year);
        this.composer = composer;
        this.leadPerformer = leadPerformer;
    }
    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getLeadPerformer() {
        return leadPerformer;
    }

    public void setLeadPerformer(String leadPerformer) {
        this.leadPerformer = leadPerformer;
    }
    @Override
    public void displayInfo() {
        System.out.println("Мюзикл: ");
        System.out.println(super.toString());
        System.out.println("Композитор: " + composer);
        System.out.println("Главный исполнитель: " + leadPerformer);
    }
}
