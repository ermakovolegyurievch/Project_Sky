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

    @Override
    public String toString() {
        return author.getSurname() + " " + author.getName() + ", " + nameOfBook + ", " + publicationYear;
    }

    @Override
    public int hashCode() {
        int result = nameOfBook == null ? 0 : nameOfBook.hashCode();
        result = 29 * result + publicationYear;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book that = (Book) obj;
        if (author != that.author) return false;
        if (publicationYear != that.publicationYear) return false;
        return nameOfBook.equals(that.nameOfBook);
    }
}