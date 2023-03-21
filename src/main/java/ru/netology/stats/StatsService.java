package ru.netology.stats;


public class StatsService {

    public long calculateSum(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum(long[] sales) {
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        return average;
    }

    public long calculateTopSales(long[] sales) {
        long maxValue = sales[0];
        int monthMain = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxValue) {
                maxValue = sales[i];
                monthMain = i + 1;
            }
        }
        return monthMain;
    }


    public long calculateLowSales(long[] sales) {
        int monthMain = 0;
        int month = 0;
        for (long sale : sales) {
            month++;
            long min = sales[0];
            if (sale < min) {
                min = sale;
                monthMain = month;

            }

        }

        return monthMain;
    }

    public long calculateLowAverageSales(long[] sales) {
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        long count = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }

        }
        return count;
    }


    public long calculateUnderAverageSales(long[] sales) {
        long sum = 0;
        long average = 0;
        for (long sale : sales) {
            sum += sale;
            average = sum / sales.length;
        }
        long count = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }

        }
        return count;
    }
}

    
                
















