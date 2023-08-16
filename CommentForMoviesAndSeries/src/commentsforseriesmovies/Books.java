package commentsforseriesmovies;

import java.util.ArrayList;

public class Books {
    private String bookName;
    private String author;
    private String bookGenre;
    private ArrayList<Comments> commentsforBook;

    public Books(String bookName, String author, String bookGenre) {
        this.bookName = bookName;
        this.author = author;
        this.bookGenre = bookGenre;
        this.commentsforBook = new ArrayList<Comments>();
    }

    public void addComments(Comments comments){
        this.commentsforBook.add(comments);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public ArrayList<Comments> getCommentsforBook() {
        return commentsforBook;
    }

    public void setCommentsforBook(ArrayList<Comments> commentsforBook) {
        this.commentsforBook = commentsforBook;
    }
}
