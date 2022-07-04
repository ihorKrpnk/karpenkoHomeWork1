package lesson8_Task2;

import java.util.ArrayList;

public class Exception2 {
    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(280, "Джедайские техники конструктивного общения", "hard", 198));
        bookCollection.add(new Book(320, "Малюнок та бюджет", "soft", 402));
        bookCollection.add(new Book(0, "Дитяча Біблія", "hard", 542));
        bookCollection.add(new Book(425, "Raven Of The Ocean", "hard", 789));
        bookCollection.add(new Book(820, "Crazy With My Pet", "soft", 415));

        try {
            bookCollection.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Под этим индексом нет книги");
        }
    }
}
