import java.time.LocalDate;

public class Book {

    long id;
    String bookName;
    int price;
    String genre;
    LocalDate createDate;

    public Book(){

    }

    public Book(Long id, String bookName,int price, String genre, LocalDate createDate){
        this.id=id;
        this.bookName=bookName;
        this.price=price;
        this.genre=genre;
        this.createDate=createDate;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nBook: " +
                "\nid: " + id +
                "\nBook name: " + bookName +
                "\nPrice: " + price +
                "\nGenre: " + genre +
                "\nCreate Date: " + createDate;
    }
}
