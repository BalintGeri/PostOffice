package org.example.Logic;

import org.example.Data.Mailtype;

import java.time.LocalDate;

public abstract class Mail {
    private final String address;
    private final LocalDate date;
    private final Mailtype type;
    private double price;

    public LocalDate getDate() {
        return date;
    }

    public Mailtype getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Mail(String address, LocalDate date, Mailtype type, double price) {
        this.address = address;
        this.date = date;
        this.type = type;
        this.price = price;
    }
}
