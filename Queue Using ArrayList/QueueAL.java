import java.util.*;
class QueueAL<D> implements Queueinterface<D>
{
	Object arr[];
	Integer size;
	D topmost;
	Integer buffer;
	QueueAL()
	{
		buffer=10;
		size=0;
		arr=new Object[buffer];
	}
	public void enqueue(D q)
	{
		if(size==buffer)
		{
			Object arr2[]=new Object [buffer*2];
			buffer*=2;
			for(Integer i=0;i<size;i++)
			{
				arr2[i]=arr[i];
			}
			arr=arr2;
			arr[size]=q;
			size++;
		}
		else
		{
			arr[size]=q;
			size++;
		}
	}
	public D dequeue()
	{
		try
		{ 
			if (size==0)
		     { 
				BoundsException ob=new BoundsException();
				throw ob;
		      }
		}
		catch(BoundsException e)
		{  
			e.printError();
			return null;
		}
	D DeletedElement=(D)arr[0];
	for (Integer i=0;i<size;i++)
	{
		arr[i]=arr[i+1];
	}
	size--;
	/*if(size==buffer/2)
		{
			Object arr2[]=new Object [buffer/2];
			buffer/=2;
			for(Integer j=0;j<size;j++)
			{
				arr2[j]=arr[j];
			}
			arr=arr2;
		}*/
	return DeletedElement;
	}
	public D peek()
	{
		topmost=(D)arr[0];
		return topmost;
	}
	public Integer size()
	{
		return size;
	}
}
