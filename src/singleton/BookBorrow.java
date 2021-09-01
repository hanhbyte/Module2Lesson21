package singleton;

public class BookBorrow {
    private BookSingleton bookSingleton;
    private boolean haveBook = false;

    public void borrowBook(){
        bookSingleton = BookSingleton.borrowBook();
        haveBook = bookSingleton != null ;
    }

    public String getAuthorAndTitle(){
        if (haveBook){
            return bookSingleton.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    public void returnBook(){
        bookSingleton.returnBook(bookSingleton);
    }
}
