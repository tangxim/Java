package Test3;

class Point {
	protected int x;
	protected int y;
	public int GetX() {
		return x;
	}
	public int GetY() {
		return y;
	}
	public void SetXY(int a, int b){
		a = x;
		b = y;
	}
	Point(){
		SetXY(0,0);
		System.out.println("构造点("+x+", "+y+")");
	}
	Point(int a, int b){
		SetXY(a,b);
		System.out.println("构造点("+x+", "+y+")");
	}
	public void Show(){
		if(this instanceof Circle)
			System.out.println("中心：(" + x + "," + y + ")");
		else
			System.out.println("点：(" + x + "," + y + ")");
	}
}
