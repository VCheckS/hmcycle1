package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtServiceTest {

    @Test
    public void testCount() {
        SqrtService service = new SqrtService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testSide() {
        SqrtService service = new SqrtService();

        int actual = service.calculate(100, 144);
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testOutSide() {
        SqrtService service = new SqrtService();

        int actual = service.calculate(101, 143);
        int expected = 1;

        assertEquals(expected, actual);
    }
}



