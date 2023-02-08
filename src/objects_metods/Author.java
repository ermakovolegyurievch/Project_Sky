package objects_metods;

public class Author {
    private final String surname;
    private final String name;


    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getSurname() + " " + getName();
    }

    @Override
    public int hashCode() {
        return surname == null ? 0 : surname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author that = (Author) obj;
        if (surname.equals(that.surname)) return false;
        return name.equals(that.name);
    }
}
