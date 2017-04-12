package Circle;

class Circle {
	final double PI =3.1415926;
	private Point Center;
	private int Radius;
	public int getRadius() {
		return Radius;
	}
	public void setRadius(int radius) {
		Radius = radius;
	}
	Circle(){
		Center = new Point();
		setRadius(5);
	}
	Circle(Point Center){
		this.Center = Center;
		setRadius(5);
	}
	Circle(int Radius){
		this.Radius = Radius;
		Center = new Point();
	}
	Circle(Point Center, int Radius){
		this(Center);
		this.Radius = Radius;
	}
	public void PrintCircleArea(){
		double area = PI * Radius * Radius;
		System.out.println("圆心" + "\t" + "圆的半径" + "\t" + "圆的面积");
		System.out.println("(" + Center.getX() + "," + Center.getY() + ")" + "\t" + getRadius() + "\t" + area);
	}
}
