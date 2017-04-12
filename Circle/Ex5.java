package Circle;

public class Ex5 {

	public static void main(String[] args) {
		Point center = new Point(2, 2);
		int radius = 5;
		Circle circle1 = new Circle();
		circle1.PrintCircleArea();
		Circle circle2 = new Circle(center);
		circle2.PrintCircleArea();
		Circle circle3 = new Circle(radius);
		circle3.PrintCircleArea();
		Circle circle4 = new Circle(center, radius);
		circle4.PrintCircleArea();
	}

}
