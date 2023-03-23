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
      long average = calculateSum(sales) / sales.length;
      return average;
    }


    public long calculateTopSales(long[] sales) {
        long maxValue = sales[0];
        int monthMain = 1;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxValue) {
                maxValue = sales[i];
                monthMain = ++i;
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

                monthMain = month;

            }

        }

        return monthMain;
    }

    public long calculateLowAverageSales(long[] sales) {
        calculateAverageSum(sales);

        long count = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < calculateAverageSum(sales)) {
                ++count;
            }

        }
        return count;
    }


    public long calculateUnderAverageSales(long[] sales) {
        calculateAverageSum(sales);
        long count = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > calculateAverageSum(sales)) {
                count++;
            }

        }
        return count;
    }
}

    
                
















