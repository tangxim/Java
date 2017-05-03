package test;

import java.io.*;

public class Copy {

	public static void main(String[] args) {
		File filein = new File("D:\\","One.txt");
		File fileout = new File("D:\\","CopyOne.txt");
		FileInputStream fis;
		try{
			if(!filein.exists())
				filein.createNewFile();
			if(!fileout.exists())
				fileout.createNewFile();
			fis = new FileInputStream(filein);
			FileOutputStream fos = new FileOutputStream(fileout, true);
			InputStreamReader in = new InputStreamReader(fis);
			OutputStreamWriter out = new OutputStreamWriter(fos);
			int is;
			while((is = in.read()) != -1){
				out.write(is);
			}
			in.close();
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
