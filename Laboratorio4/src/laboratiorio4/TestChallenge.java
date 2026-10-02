package laboratiorio4;
public class TestChallenge {
    public static void main(String[] args) {
        Author author = new Author("Alice Oseman");
        author.addBook("Heartstopper", 25.0);
        Book book2 = new Book("Solitario", author, 18.0);
        author.addBook(book2);
        System.out.println("Libros de " + author.getName() + ":");
        for (Book b : author.getBooks()) {
            b.getInfo();
        }
    }
}