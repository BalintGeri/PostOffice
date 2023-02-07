package org.example.Logic;

import org.example.Data.Mailtype;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PostOfficeTest {
    PostOffice office = new PostOffice();

    Letter l1 = new Letter("ide", LocalDate.now(), Mailtype.LETTER, 1.99);
    Letter l2 = new Letter("oda", LocalDate.now(), Mailtype.LETTER, 1.99);
    Box bb = new Box("amoda", LocalDate.now(), Mailtype.BIGBOX, 10.29, 100);
    Box sb = new Box("emide", LocalDate.now(), Mailtype.SMALLBOX, 7.99, 0);

    @org.junit.Test
    public void getRevenueForTypeSmallBox() {
        office.addToMails(l1);
        office.addToMails(l2);
        office.addToMails(bb);
        office.addToMails(sb);
        assertEquals(7.99, office.getRevenueForType(Mailtype.SMALLBOX), 0.1);
    }

    @org.junit.Test
    public void getRevenueForTypeBigBox() {
        office.addToMails(l1);
        office.addToMails(l2);
        office.addToMails(bb);
        office.addToMails(sb);
        assertEquals(39.29, office.getRevenueForType(Mailtype.BIGBOX), 0.1);
    }
}