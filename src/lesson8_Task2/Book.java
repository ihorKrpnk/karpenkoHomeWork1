package lesson8_Task2;

import java.util.ArrayList;

public class Book extends ArrayList<Book> {

    double price;
    String title;
    String coverType;
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