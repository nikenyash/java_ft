package ru.stqa.ft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testPoint(){
    Point p = new Point(1.0, 1.0, 6.0, 1.0);
    Assert.assertEquals(p.distance(), 5);
  }

}
