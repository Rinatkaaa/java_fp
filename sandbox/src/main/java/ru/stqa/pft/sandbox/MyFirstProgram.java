package ru.stqa.pft.sandbox;

import static java.awt.geom.Point2D.distance;
import static java.awt.geom.Point2D.distanceSq;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");
		hello("user");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p1 = new Point(2,2);
		Point p2 = new Point(10,10);
		System.out.println("Расстояние между двумя точками " + p1.toString() + " и " + p2.toString() + " = " + p1.distance(p2));

	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

}