import java.util.Arrays;
import java.util.Scanner;

public class Library {
    long id;
    String name;
    String address;
    Book [] books;

    public Library(){

    }

    public Library(long id, String name, String address,Book[] books){
        this.id=id;
        this.name=name;
        this.address=address;
        this.books=books;
    }


    public static void libraries(Library[] Libraries) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    
                    Please select a library id №
                    1-id) "Городская библиотека"
                    2-id) "Республиканская библиотека"
                    3-id)  "Центральная библиотека"
                    """);
            int scanId = scanner.nextInt();
            for (Library library : Libraries) {
                if (library.id == scanId) {
                    System.out.println(library);
                } else if (scanId > 3) {
                    System.out.println("ERROR (такого id номера нет, выберите снова)");
                    break;
                }

            }

        }
    }


    @Override
    public String toString() {
        return "\n" +
                "\nLibrary: " +
                "\nid: " + id +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nBooks: " + Arrays.toString(books);
    }
}
