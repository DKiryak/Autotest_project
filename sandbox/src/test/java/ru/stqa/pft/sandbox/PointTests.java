package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void calculateDistance() {
        Point p1 = new Point(-1.5, 2.9);
        Point p2 = new Point(10.3, 4.6);
        Point p3 = new Point(7.2, -8.4);
        Assert.assertEquals(Point.distance(p1,p2), 11.921828718783038);
    }

    @Test
    public void calculateDistance2() {
        Point p1 = new Point(-1.5, 2.9);
        Point p3 = new Point(7.2, -8.4);
        Assert.assertEquals(Point.distance(p1,p3), 14.261135999632007);
    }

    @Test
    public void calculateDistance3() {
        Point p2 = new Point(10.3, 4.6);
        Point p3 = new Point(7.2, -8.4);
        Assert.assertEquals(Point.distance(p2,p3), 13.364505228402585);
    }
}
