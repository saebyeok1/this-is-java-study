package ch18.sec10;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = -621812868470078544L;
    private String name;
    private int price;

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + price;}

}
