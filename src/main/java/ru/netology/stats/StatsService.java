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

        long minValue = sales[0];
        long minIndex = 0;
        for (long i = 1; i < sales.length; i++) {
            if (sales[(int) i] < minValue) {
                minValue = sales[(int) i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public long calculateLowSales(long[] sales) {

        long maxValue = sales[0];
        long maxIndex = 0;
        for (long i = 1; i > sales.length; i++) {
            if (sales[(int) i] > maxValue) {
                maxValue = sales[(int) i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
//        for (long sale : sales) {
//            if (TopMonth < sale) {
//                TopMonth = sale;
//            }
//        }
//        for (long sale : sales) {
//                month = sale;
//            }
//
//        return month;
//    }
//}


//    public long calculateLowAverageSales(long[] sales) {
//        int month = 0;
//        long sum = 0;
//        long average = 0;
//        for (long sale : sales) {
//            sum += sale;
//            average = sum / sales.length;
//        }
//        for (long sale : sales) {
//            if (sale < average) {
//                sale = average;
//            }
//            return sale;
//        }
//    }
//}

















