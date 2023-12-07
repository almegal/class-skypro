import java.util.Objects;

public class Book {
    private int dataPublished;
    private Author author;
    private String bookName;

    Book(int dataPublished, Author author, String bookName) {
        this.author = author;
        this.dataPublished = dataPublished;
        this.bookName = bookName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getDataPublished() {
        return this.dataPublished;
    }

    public String getAuthor() {
        return this.author.getName() + " " + this.author.getSurrName();
    }

    public void setDataPublished(int dataPublished) {
        this.dataPublished = dataPublished;
    }

    @Override
    public String toString(){
        return "{\n" +
                "Название: " + this.bookName +
                "; \nДата издания: " + this.dataPublished +
                "; \nAвтор: " + author.toString() +
                "\n}";
    }

    @Override
    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()) return false;

        Book book = (Book) other;

        return bookName.equals(book.getBookName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
