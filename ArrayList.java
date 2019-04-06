import java.util.*;
class ArrayList implements List
{
	Integer array[];
	Integer size;
	Integer buffer;
	ArrayList()
	{
		buffer=5;
		size=0;
        	array=new Integer[buffer];
	}
	public void add(Integer i)
	{
		if(size==buffer)
		{
	       		Integer arr[]=new Integer[buffer*2];
			buffer*=2;
			for(Integer j=0;j<size;j++)
			{
				arr[j]=array[j];
			}
			array=arr;
		}
		else
		{
			array[size]=i;
			size++;
		}
	}
	public void search(Integer p)
	{
		Integer s=0;
		while(array[s]<p)
		{
			s++;
		}
		for(Integer i=size;i>=s;i--)
		{
			array[i]=array[i-1];
		}
		array[s]=p;
		size+=1;
		if(size==buffer)
		{
	       		Integer arr[]=new Integer[buffer*2];
			buffer*=2;
			for(Integer j=0;j<size;j++)
			{
				arr[j]=array[j];
			}
			array=arr;
		}
	}
	public void traverse()
	{
		Integer a=0;
		while(a<size)
		{
			System.out.println(array[a]);
			a+=1;
		}
	}

}
