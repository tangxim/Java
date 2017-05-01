package test;

public class MyException extends Exception{
	private String content;
	public MyException(String content){
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
}


package test;

public class Computer {
	public int hcf(int n,int m){
		int r = 0;
		while(m != 0){
			r = n % m;
			n = m;
			m = r;
		}
		return n;
	}
	public void check(int n, int m) throws MyException{
		if(n < 0 && m < 0){
			throw new MyException("第一个数" + n +"  第二个数" + m + "  两个数均为负整数！");
		}if(m < 0){
			throw new MyException("第一个数" + n +"  第二个数" + m + "  第二个数为负整数！");
		}if(n < 0){
			throw new MyException("第一个数" + n +"  第二个数" + m + "  第一个数为负整数！");
		}else{
			throw new MyException("第一个数" + n +"  第二个数" + m + "  最大公约数为" + hcf(n,m) + "。");
		}
		
	}
}


package test;

public class Three {

	public static void main(String[] args) {
		int a = -1;
		int b = 27;
		int c = 15;
		int d = -2;
		Computer com = new Computer();
		try{
			com.check(a, b);
		}catch(MyException e){
			System.out.println(e.getContent());
		}
		try{
			com.check(b, d);
		}catch(MyException e){
			System.out.println(e.getContent());
		}
		try{
			com.check(a, d);
		}catch(MyException e){
			System.out.println(e.getContent());
		}
		try{
			com.check(b, c);
		}catch(MyException e){
			System.out.println(e.getContent());
		}
		System.out.println("2015211899 唐溪蔓");
	}

}
