package lesson7;

import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book(280, "Джедайские техники конструктивного общения", "hard", 198));
        bookCollection.add(new Book(320, "Малюнок та бюджет", "soft", 402));
        bookCollection.add(new Book(0, "Дитяча Біблія", "hard", 542));
        bookCollection.add(new Book(425, "Raven Of The Ocean", "hard", 789));
        bookCollection.add(new Book(820, "Crazy With My Pet", "soft", 415));
        bookCollection.add(new Book(180, "Farmers And Scientists", "hard", 210));
        bookCollection.add(new Book(720, "Doctor Gamble", "hard", 652));
        bookCollection.add(new Book(1450, "Gods And Invaders", "hard", 743));
        bookCollection.add(new Book(405, "Amphibians In Your Garden", "soft", 357));
        bookCollection.add(new Book(987, "Inspiration Of Stardust", "soft", 852));

        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();

        for (Book bookCollectionCol : bookCollection) {
            if (bookCollectionCol.getCoverType().equals("soft")) {
                booksWithSoftCover.add(bookCollectionCol);
            } else {
                booksWithHardCover.add(bookCollectionCol);
            }
        }

        System.out.println("В магазине есть следующие книги: ");
        System.out.println(" ");
        for (Book bookCol : bookCollection) {
            System.out.println(bookCol.getTitle());
        }
        System.out.println("________________________________________________");
        System.out.println("Книги с мягким переплетом: ");
        System.out.println(" ");
        for (Book bookCol : booksWithSoftCover) {
            System.out.println(bookCol.getTitle());
        }
        System.out.println("________________________________________________");
        System.out.println("Книги с твердым переплетом: ");
        System.out.println(" ");
        for (Book bookCol : booksWithHardCover) {
            System.out.println(bookCol.getTitle());
        }
    }
}

class Book extends ArrayList<Book> {

    double price;
    String title;
    String coverType; // (может быть только hard или soft)
    int quantityOfPages;

    public Book(double price, String title, String coverType, int quantityOfPages) {
        this.price = price;
        this.title = title;
        this.coverType = coverType;
        this.quantityOfPages = quantityOfPages;
        setPrice(price);
        setTitle(title);
        setCoverType(coverType);
        setQuantityOfPages(quantityOfPages);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
}