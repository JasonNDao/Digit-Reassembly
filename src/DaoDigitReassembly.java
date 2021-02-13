//Jason Dao
//ACSL
import java.util.Scanner;
import java.io.*;
public class DaoDigitReassembly {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(new File("numbers"));	
	String read=s.next();
	int number=s.nextInt();
	String read2=s.next();
	int number2=s.nextInt();
	String read3=s.next();
	int number3=s.nextInt();
	String read4=s.next();
	int number4=s.nextInt();
	String read5=s.next();
	int number5=s.nextInt();
	
	int shortnumber=0;
	int sum=0;
	int start=0;
	int finish=number;
	int count=1;

	while (true)
	{	
		while (read.length()%number != 0)
		{
			read=read + "0";
		}
		for(int i=1; i <=read.length()/number; i++)
		{
			String string2=read.substring(start, finish);
			shortnumber=Integer.parseInt(string2);
			sum += shortnumber;
			start=finish;
			finish +=number;
		}
		System.out.println(count +". "+sum);
		count ++;
		if (count==2)
		{
			read=read2;
			number=number2;
			start=0;
			finish=number;
			sum=0;
		}
		if (count==3)
		{
			read=read3;
			number=number3;
			start=0;
			finish=number;
			sum=0;
		}
		if (count==4)
		{
			read=read4;
			number=number4;
			start=0;
			finish=number;
			sum=0;
		}
		if (count==5)
		{
			read=read5;
			number=number5;
			start=0;
			finish=number;
			sum=0;
		}
		if (count==6)
		{
			break;
		}
	
	}
  }
	

}
