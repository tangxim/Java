package Circle;

class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	Point(){
		setX(0);
		setY(0);
	}
	Point(int a,int b){
		setX(a);
		setY(b);
	}
}
