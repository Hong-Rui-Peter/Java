import java.io.*;

public class InputFile01 
{
	public static void main(String[] args)
	{
	    try
	    {
	        FileInputStream fin=new FileInputStream("D:/mytxt.txt");
	        int size=fin.available();
	        byte b[]=new byte[size];
	        fin.read(b);
	        System.out.println("D:/mytxt.txt可讀位元組的數量：" + size);
	        for (int i=0; i<size; i++)
	        {
	            System.out.print((char)b[i]);
	        }
	        fin.close();
	    }
	    catch(IOException e)
	    {
			System.out.println("輸入檔案路徑有誤!!");
	    }
	}
}
