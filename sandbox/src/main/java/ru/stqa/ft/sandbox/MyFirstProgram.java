package ru.stqa.ft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Nikita");

		double lem = 5;
		System.out.println("Площадь квадрата со стороной " + lem + " равна " + area(lem));

		double a = 3;
		double b = 8;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + rectangle(a,b));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(double l) {
		return l * l;
	}

	public static double rectangle(double a, double b) {
		return a * b;
	}
}