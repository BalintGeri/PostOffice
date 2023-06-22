package org.example.Logic;

import org.example.Data.Mailtype;

import java.time.LocalDate;

public class Letter extends Mail {
    public Letter(String address, LocalDate date, Mailtype type, double price) {
        super(address, date, type, price);
    }

}
