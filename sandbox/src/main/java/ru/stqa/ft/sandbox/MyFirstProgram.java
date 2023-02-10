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
		Point p2 = new Point(3.0, 3.0);

		System.out.println(Point.distance(p1, p2));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}