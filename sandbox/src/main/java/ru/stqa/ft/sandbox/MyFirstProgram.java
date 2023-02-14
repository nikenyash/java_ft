package ru.stqa.ft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("Nikita");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

		Rectangle r = new Rectangle(3, 8);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

		Point p1 = new Point(1.0, 1.0);
		Point p2 = new Point(6.0, 1.0);
		System.out.println("Расстояние между двумя точками на плоскости равно " + p1.distance(p2));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}