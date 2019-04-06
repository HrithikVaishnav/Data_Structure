import java.util.*;
class Driver
{
	public static void main(String args[])
	{
	LinearList<Integer> al=new LinearList<Integer>();
	for(Integer i=0;i<11;i=i+2)
	{
	  al.add(i);
	}
	al.Traverse();
	Scanner sc=new Scanner(System.in);
	Integer a=sc.nextInt();
	/*switch(a)
	{
	 case 1: al.Traverse();
		 break;
	}*/
	
	al.Search(a);
	al.Add(12,3);
	al.Traverse();
	}
}
