public class App {
   public static void main(String[] args) {
        Author tolstoi = new Author("Лев", "Толстой");
        Author pushkin = new Author("Сашка","Пушкин");

        Book book1 = new Book(1867, tolstoi, "Война и Мир");
        Book book2 = new Book(1831, pushkin, "Евгений Онегин");

       System.out.println("book1.getBookName() = " + book1.getBookName());
       System.out.println("book1.getDataPublished() = " + book1.getDataPublished());
       System.out.println("book1.getAuthor() = " + book1.getAuthor());

       System.out.println("book2.getBookName() = " + book2.getBookName());
       System.out.println("book2.getDataPublished() = " + book2.getDataPublished());
       System.out.println("book2.getAuthor() = " + book2.getAuthor());

       book1.setDataPublished(2023);
       System.out.println("book1.getDataPublished() = " + book1.getDataPublished());
   }

}


