package Test3;

public class Ex6 {

	public static void main(String[] args) {
		Point center = new Point(2,2);
		center.Show();
		int radius = 3;
		Circle circle1 = new Circle();
		circle1.Show();
		circle1.PrintArea();
		Circle circle4 = new Circle(center,radius);
		circle4.Show();
		circle4.PrintArea();
	}

}
