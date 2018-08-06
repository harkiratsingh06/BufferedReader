import java.io.*;
class test
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int a=Integer.parseInt(br.readLine());
		System.out.println(a);
	}
}