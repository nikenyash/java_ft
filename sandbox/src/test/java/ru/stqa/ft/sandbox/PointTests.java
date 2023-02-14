package ru.stqa.ft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint(){
    Point p1 = new Point(1.0, 1.0);
    Point p2 = new Point(6.0, 1.0);
    Assert.assertEquals(p1.distance(p2), 5);
  }

}
