class Student{
	private String ID;
	public String GetID(){
		return ID;
	}
	public void SetID(String ID){
		this.ID = ID;
	}
	private String Name;
	public String GetName(){
		return Name;
	}
	public void SetName(String Name){
		this.Name = Name;
	}
	private int Age;
	public int GetAge(){
		return Age;
	}
	public void SetAge(int Age){
		this.Age = Age;
	}
	private boolean Sex;
	public boolean GetSex(){
		return Sex;
	}
	public void SetSex(boolean Sex){
		this.Sex = Sex;
	}
}
class Ex4{
	public static void main(String[] args){
		Student stu = new Student();
		stu.SetID("2015123123");
		stu.SetName("唐某某");
		stu.SetAge(20);
		stu.SetSex(false);
		System.out.println("学号"+"\t" + "\t" +"姓名"+"\t"+"年龄"+"\t"+"性别");
		System.out.println(stu.GetID() +"\t" + stu.GetName() + "\t" + stu.GetAge() + "\t" +(stu.GetSex()?"男":"女"));
	}
}
