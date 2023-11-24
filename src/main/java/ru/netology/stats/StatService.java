package ru.netology.stats;
public class StatService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;
    }

    public long average (long[] sales) {
        return sum(sales) / sales.length;
    }

    public int calcMonthMaximumSale(long[] sales) {
        int monthMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximumSale]) {
                monthMaximumSale = i;
            }
        }
        return monthMaximumSale + 1;
    }

    public int calcMonthMinimumSale(long[] sales) {
        int monthMinimumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimumSale]) {
                monthMinimumSale = i;
            }
        }
        return monthMinimumSale + 1;
    }

    public int calcMonthsWithSalesBelowAverage (long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthsWithSalesHigherAverage (long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
    }


