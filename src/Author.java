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
}
