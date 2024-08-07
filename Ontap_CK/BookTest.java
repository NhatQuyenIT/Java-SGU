package Ontap_CK;

public class BookTest {
    public static void main(String[] args) {
        // Tạo một số tác giả
        Author author1 = new Author("Author1", "author1@example.com", 'M');
        Author author2 = new Author("Author2", "author2@example.com", 'F');
        
        // Tạo một mảng chứa các tác giả
        Author[] authors = {author1, author2};
        
        // Tạo một đối tượng Book
        Book book = new Book("Sample Book", authors, 29.99, 100);

        // Gọi phương thức toString và in ra kết quả
        System.out.println(book.toString());
        
     // Gọi phương thức getAuthorNames và in ra kết quả
        System.out.println("Author Names: " + book.getAuthorNames());
    }
}