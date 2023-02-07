package org.example.Logic;

import org.example.Data.Mailtype;

import java.time.LocalDate;

public class Box extends Mail {
    private final int weight;

    public Box(String address, LocalDate date, Mailtype type, double price, int weight) {
        super(address, date, type, price);
        this.weight = weight;
        calculatePrice();
    }

    private void calculatePrice() {
        if (getType() == Mailtype.BIGBOX) {
            setPrice(10.29 + (0.29 * weight));
        } else if (getType() == Mailtype.SMALLBOX) {
            setPrice(7.99);
        }
    }
}
