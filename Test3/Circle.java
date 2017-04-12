package Test3;

class Circle extends Point{
	final double PI =3.1415926;
	protected int Radius;
	Circle(){
		Radius = 5;
		System.out.println("构造圆(半径: "+Radius+")");
	}
	Circle(Point Center, int Radius){
		super(Center.GetX(),Center.GetY());
		this.Radius = Radius;
		System.out.println("构造圆(半径: "+Radius+")");
	}
	public void PrintArea(){
		double area = PI * Radius *Radius;
		System.out.println("面积：" + area);
	}
	public void Show(){
		super.Show();
		System.out.println("半径：" + Radius);
	}
}
