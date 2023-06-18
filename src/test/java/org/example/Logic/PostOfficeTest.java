package org.example.Logic;

import org.example.Data.Mailtype;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PostOfficeTest {
    PostOffice office = new PostOffice();

    Letter letter1 = new Letter("here", LocalDate.now(), Mailtype.LETTER, 1.99);
    Letter letter2 = new Letter("there", LocalDate.of(2023, 6, 3), Mailtype.LETTER, 1.99);
    Box bigBox = new Box("thatWay", LocalDate.now(), Mailtype.BIGBOX, 10.29, 100);
    Box smallBox = new Box("thisWay", LocalDate.now(), Mailtype.SMALLBOX, 7.99, 0);

    @org.junit.Before
    public void addMail() {
        office.addToMails(letter1);
        office.addToMails(letter2);
        office.addToMails(bigBox);
        office.addToMails(smallBox);
    }

    @org.junit.Test
    public void getRevenueForTypeSmallBox() {
        assertEquals(7.99, office.getRevenueForType(Mailtype.SMALLBOX), 0.1);
    }

    @org.junit.Test
    public void getRevenueForTypeBigBox() {
        assertEquals(39.29, office.getRevenueForType(Mailtype.BIGBOX), 0.1);
    }

    @org.junit.Test
    public void listAllMailOnGivenDate() {
        assertEquals(letter2, office.listAllMailOnGivenDate(LocalDate.of(2023, 6, 3)));
    }
}