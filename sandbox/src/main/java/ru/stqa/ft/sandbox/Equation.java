package ru.stqa.ft.sandbox;

public class Equation {

  private final double a;
  private final double b;
  private final double c;
  private int n;

  public Equation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;

    double d = Math.pow(b, 2) - 4*a*c;

    if (d > 0) {
      n = 2;
    } else {
      if (d == 0) {
        n = 1;
      } else {
        n = 0;
      }
    }
  }

  public int rootNumber() {
    return n;
  }

}
