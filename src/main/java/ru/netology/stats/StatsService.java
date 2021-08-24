package ru.netology.stats;

public class StatsService {

    public int CalculateMinSales(long[] Sales) {
        int MinMonth = 0;
        int Month = 0;
        for (long Sale : Sales) {
            if (Sale <= Sales[MinMonth]) {
                MinMonth = Month;
            }
            Month = Month + 1;
        }
        return MinMonth + 1;
    }

    public long CalculateAllSum(long[] Sales) {
        long Sum = 0;
        for (long Sale : Sales) {
            Sum += Sale;
        }
        return Sum;
    }

    public long CalculateAverage(long[] Sales) {
        long Sum = CalculateAllSum(Sales);
        return Sum / Sales.length;
    }

    public int CalculateMaxSales(long[] Sales) {
        int MinMonth = 0;
        int Month = 0;
        for (long Sale : Sales) {
            if (Sale >= Sales[MinMonth]) {
                MinMonth = Month;
            }
            Month = Month + 1;
        }
        return MinMonth + 1;
    } //

    public int CalculateBelowAverage(long[] Sales) {
        int Month = 0;
        double Average = CalculateAverage(Sales);
        for (long Sale : Sales) {
            if (Sale > Average) {
                Month++;
            }
        }
        return Month;
    }

    public int CalculateAboveAverage(long[] Sales) {
        double Average = CalculateAverage(Sales);
        int Month = 0;
        for (long Sale : Sales) {
            if (Sale < Average) {
                Month++;
            }
        }
        return Month;
    }
}