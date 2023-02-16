package ru.stqa.ft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint1(){
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(6.0, 1.0);
    Assert.assertEquals(p1.distance(p2), 5);
  }

  @Test
  public void testPoint2(){
    Point p1 = new Point(2.0, 4.9);
    Point p2 = new Point(6.0, 6.1);
    Assert.assertEquals(p1.distance(p2), 4.176122603564219);
  }

  @Test
  public void testPointNegative(){
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(6.0, 1.0);
    Assert.assertEquals(p1.distance(p2), 7.0);
  }
}
