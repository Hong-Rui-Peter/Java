 import java.util.Scanner;
 import java.io.*;

 public class WriteFile {
	public static void main(String[] args)
	{
		try
	    {
			String fpath = "D:/test.txt";
			BufferedWriter fout=new BufferedWriter(new FileWriter(fpath));
			fout.write("Java SE 8��¦���׽�");
			fout.newLine();
			fout.write("Visual C# 2013 �{���]�p�g��");
			fout.newLine();
			fout.close();
			System.out.println(fpath+"�g�ɧ���");
		}
		catch (IOException e)
		{
			System.out.println("��J�ɮ׸��|���~!!");
		}
	}
 }
