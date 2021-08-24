package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void ShouldCalculateMinSales() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Actual = service.CalculateMinSales(Sales);
        long Expected = 9;
        assertEquals(Expected, Actual);
    }

    @Test
    public void ShouldCalculateAllSum() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Expected = 180;
        long Actual = service.CalculateAllSum(Sales);
        assertEquals(Expected, Actual);
    }

    @Test
    public void ShouldCalculateAverage() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Expected = 15;
        long Actual = service.CalculateAverage(Sales);
        assertEquals(Expected, Actual);
    }

    @Test
    public void ShouldCalculateMaxSales() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Actual = service.CalculateMaxSales(Sales);
        long Expected = 8;
        assertEquals(Expected, Actual);
    }


    @Test
    public void ShouldCalculateBelowAverage() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Actual = service.CalculateBelowAverage(Sales);
        long Expected = 5;
        assertEquals(Expected, Actual);
    }

    @Test
    public void ShouldCalculateAboveAverage() {
        StatsService service = new StatsService();
        long[] Sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long Actual = service.CalculateBelowAverage(Sales);
        long Expected = 5;
        assertEquals(Expected, Actual);
    }
}

