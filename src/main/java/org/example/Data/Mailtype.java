package org.example.Data;

public enum Mailtype {
    LETTER(1.99),
    SMALLBOX(7.99),
    BIGBOX(10.29);

    private final double price;

    public double getPrice() {
        return price;
    }

    Mailtype(double price) {
        this.price = price;
    }
}
