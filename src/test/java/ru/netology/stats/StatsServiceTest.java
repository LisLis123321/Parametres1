package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;

        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);

        System.out.println(service.calculateSum(sales));
    }

    @Test
    void shouldCalculateAverageSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;

        long actual = service.calculateAverageSum(sales);
        assertEquals(expected, actual);

        System.out.println(service.calculateAverageSum(sales));

    }


    @Test
    void shouldCalculateTopSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;

        long actual = service.calculateTopSales(sales);
        assertEquals(expected, actual);

        System.out.println(service.calculateTopSales(sales));
    }

    @Test
    void shouldCalculateLowSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.calculateLowSales(sales);
        assertEquals(expected, actual);

        System.out.println(service.calculateLowSales(sales));
    }


    @Test
    void shouldCalculateLowAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 4;

        long actual = service.calculateLowAverageSales(sales);
        assertEquals(expected, actual);

        System.out.println(service.calculateLowAverageSales(sales));
    }

    @Test
    void shouldCalculateUnderAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.calculateUnderAverageSales(sales);
        assertEquals(expected, actual);

        System.out.println(service.calculateUnderAverageSales(sales));
    }
}