package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void calcForPositiveAndIntValue() {
        Service service = new Service();
        int actual = service.calc(10_000, 3_000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcForPositiveAndIntValue2() {
        Service service = new Service();
        int actual = service.calc(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}
