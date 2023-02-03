package objects_metods;

public class Book {
    private String nameOfBook;
    private int publicationYear;

    private Author author;

    public Book(Author author, String nameOfBook, int publicationYear) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.publicationYear = publicationYear;

    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}