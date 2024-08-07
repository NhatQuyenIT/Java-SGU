package Ontap_CK;

public class BookManager {
    public static void main(String[] args) {
        // Tạo một mảng chứa các đầu sách
        Book[] books = createBookArray();

        // Tìm đầu sách có số lượng nhiều nhất
        Book bookWithMaxQty = findBookWithMaxQty(books);

        // In thông tin của đầu sách có số lượng nhiều nhất
        System.out.println("Book with Maximum Quantity:");
        System.out.println(bookWithMaxQty.toString());
    }

    // Phương thức tạo mảng các đầu sách
    private static Book[] createBookArray() {
        Author author1 = new Author("Author1", "author1@example.com", 'M');
        Author author2 = new Author("Author2", "author2@example.com", 'F');

        Author[] authors1 = { author1, author2 };
        Author[] authors2 = { author1 };

        Book book1 = new Book("Book1", authors1, 19.99, 50);
        Book book2 = new Book("Book2", authors2, 29.99, 100);
        Book book3 = new Book("Book3", authors1, 14.99, 75);

        return new Book[] { book1, book2, book3 };
    }

    // Phương thức tìm đầu sách có số lượng nhiều nhất
    private static Book findBookWithMaxQty(Book[] books) {
        if (books == null || books.length == 0) {
            return null; // Trả về null nếu mảng rỗng hoặc null
        }

        Book bookWithMaxQty = books[0];

        for (int i = 1; i < books.length; i++) {
            if (books[i].getQty() > bookWithMaxQty.getQty()) {
                bookWithMaxQty = books[i];
            }
        }

        return bookWithMaxQty;
    }
} 
