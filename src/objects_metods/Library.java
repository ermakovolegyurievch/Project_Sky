package objects_metods;

public class Library {

    public static void main(String[] args) {
        Author author1 = new Author("Вэнс", "Джек");
        Book book1 = new Book(author1, "Легенды Умирающей Земли", 2022);
        Author author2 = new Author("Рейд", "Тейлор");
        Book book2 = new Book(author2, "Еще одна настоящая любовь", 2023);
        book1.setPublicationYear(2021);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author1.equals(author2));
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));
    }
}





