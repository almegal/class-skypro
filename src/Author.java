import java.util.Objects;

public class Author {
    private final String name;
    private final String surrName;

    public Author(String name, String surrName) {
        this.name = name;
        this.surrName = surrName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurrName() {
        return this.surrName;
    }

    @Override
    public String toString(){
        return "{" + " Author: "
                + this.getName()
                + " "
                + this.getSurrName() +
                " }";
    }

    @Override
    public boolean equals(Object other){
        if(this.getClass() != other.getClass()) return false;

        Author author = (Author) other;

        return name.equals(author.getName()) && surrName.equals(author.getSurrName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surrName);
    }
}
