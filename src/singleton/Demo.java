package singleton;

public class Demo {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrow bookBorrow1 = new BookBorrow();
        BookBorrow bookBorrow2 = new BookBorrow();

        bookBorrow1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author And Titte: ");
        System.out.println(bookBorrow1.getAuthorAndTitle());

        bookBorrow2.borrowBook();
        System.out.println("BookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author And Titte: ");
        System.out.println(bookBorrow2.getAuthorAndTitle());

        bookBorrow1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrow2.borrowBook();
        System.out.println("BookBorrower2 Author And Titte: ");
        System.out.println(bookBorrow2.getAuthorAndTitle());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
