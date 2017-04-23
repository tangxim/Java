package test;

public class Duck implements CanFly,CanSwim{
	public void fly(){
		System.out.println("鸭子能飞！");
	}
	public void swim(){
		System.out.println("鸭子能游泳！");
	}
	public static void main(String[] args){
		Duck duck = new Duck();
		duck.fly();
		duck.swim();
	}
}
