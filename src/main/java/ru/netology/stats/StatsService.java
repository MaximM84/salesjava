package ru.netology.stats;


public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int countMonthsOfSalesBelowAverage(long[] sales) {
        long average = average(sales);
        long countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonth++;
            }
        }
        return (int) countMonth;

    }

    public int countMonthsOfSalesHigherAverage(long[] sales) {
        long average = average(sales);
        int countMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonth++;
            }
        }
        return countMonth;

    }
}
