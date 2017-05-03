package test;

import java.io.*;

public class One {

	public static void main(String[] args) {
		int b;
		File file = new File("D:\\","One.txt");
		byte bytes[] = new byte[512];
		System.out.println("请输入一个电话号码：");
		try{
			if (!file.exists())
				file.createNewFile();
			b = System.in.read(bytes);
			FileOutputStream fos = new FileOutputStream(file, true);
			fos.write(bytes, 0, b);
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
