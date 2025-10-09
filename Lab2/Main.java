public class Main {
    public static void main(String[] args) {
        Audiobook audiobook = new Audiobook("Капитанская дочка", "Александр Сергеевич Пушкин", 1836, 3.47, "Денис Власенко");
        Movie movie = new Movie("Алые паруса", "Александр Грин", 1961, "Александр Птушко", 1.22);
        Musical musical = new Musical("Призрак оперы", "Эндрю Ллойд Уэббер", 1986, "Эндрю Ллойд Уэббер", "Майкл Кроуфорд");
        audiobook.displayInfo();
        System.out.println();
        movie.displayInfo();
        System.out.println();
        musical.displayInfo();
        System.out.println();
        System.out.println("Количество созданных книг: " + Book.getBookCount());
    }
}
