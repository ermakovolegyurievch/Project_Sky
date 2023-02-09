package objects_metods;

import java.util.Objects;

public record Author(String surname, String name) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return surname.equals(author.surname) && name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }


    @Override
    public String toString() {
        return surname + " " + name;
    }
}
