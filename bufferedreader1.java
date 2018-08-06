import java.io.*;
class test
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int i=Integer.parseInt(br.readLine());
		String s=br.readLine();
		System.out.println(s);
		System.out.println(i);
	}
}