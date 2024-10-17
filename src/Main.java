import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1L, "Мастер и Маргарита", 1500, "Роман", LocalDate.of(2023, 5, 20));
        Book book2 = new Book(2L, "Шантарам", 2000, "Роман", LocalDate.of(2022, 9, 25));
        Book book3 = new Book(3L, "Три товарища", 1700, "Проза", LocalDate.of(2024, 1, 10));
        Book book4 = new Book(4L, "Цветы для Элджернона", 2500, "Фантастика", LocalDate.of(2024, 5, 20));
        Book book5 = new Book(5L, "Маленький принц", 5000, "Детская литература", LocalDate.of(2023, 5, 20));
        Book[] books1 = {book1, book2, book3, book4, book5};

        Book book6 = new Book(1L, "Вино из одуванчиков", 1000, "Фантастика", LocalDate.of(2020, 6, 27));
        Book book7 = new Book(2L, "Анна Каренина", 2700, "Проза", LocalDate.of(2017, 3, 29));
        Book book8 = new Book(3L, "Преступление и наказание", 1900, "Проза", LocalDate.of(2019, 8, 15));
        Book book9 = new Book(4L, "Сто лет одиночества", 2500, "Проза", LocalDate.of(2021, 3, 29));
        Book book10 = new Book(5L, "Граф Монте-Кристо", 4000, "Приключение", LocalDate.of(2019, 10, 10));
        Book[] books2 = {book6, book7, book8, book9, book10};

        Book book11 = new Book(1L, "Белый пароход", 900, "Повесть", LocalDate.of(2022, 4, 23));
        Book book12 = new Book(2L, "Джамиля", 1100, "Повесть", LocalDate.of(2020, 9, 19));
        Book book13 = new Book(3L, "Кровавые годы", 2000, "Роман", LocalDate.of(2018, 10, 5));
        Book book14 = new Book(4L, "Среди гор", 2500, "Роман", LocalDate.of(2020, 12, 9));
        Book book15 = new Book(5L, "Первый учитель", 1000, "Повесть", LocalDate.of(2022, 6, 15));
        Book[] books3 = {book11, book12, book13, book14, book15};

        Library library1 = new Library(1L, "Городская библиотека", "ул.Исанова 78", books1);
        Library library2 = new Library(2L, "Республиканская библиотека", "пр.Мира 61", books2);
        Library library3 = new Library(3L, "Центральная библиотека", "ул.Советская 208", books3);
        Library[] libraries = {library1, library2, library3};


        Library.libraries(libraries);




    }
}