package objects_metods;

import java.util.Objects;

public class Book {
    private final String nameOfBook;
    private int publicationYear;

    private final Author author;

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

    @Override
    public String toString() {
        return author + ", " + nameOfBook + ", " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPublicationYear() == book.getPublicationYear() && getNameOfBook().equals(book.getNameOfBook()) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getPublicationYear(), author);
    }
}