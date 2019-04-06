class ArrayList<D> implements List<D>
{
	Object array[];
	Integer size;
	Integer buffer;
	ArrayList()
	{
		    buffer=5;
		    size=0;
         array=new Object[buffer];
	}
	public boolean isempty()
	{
	    return (size==0);
	}
	public void add(D i)
	{
		if(size==buffer)
		{
		         
	        Object arr[]=new Object[buffer*2];
			buffer*=2;
			for(Integer j=0;j<size;j++)
			{
				arr[j]=array[j];
			}
			array=arr;
			array[size]=i;
			size++;
		}
		else
		{
			array[size]=i;
			size++;
		}
	}
	
	public void Traverse()
	{
		Integer a=0;
		while(a<size)
		{
			System.out.println(array[a]);
			a+=1;
		}
	}
	public Integer Search(D o)
    {
        Integer i;
        for(i=0;i<size;i++)
        {
         if(array[i]==o)
         break;
        }
        return i;
    }
    public D getElementAt(Integer pos)
    {
        try{
            if(pos<0||pos>=size)
            throw new BoundException();
        }
        catch(BoundException e)
        {e.printError(pos);
        return null;
        }
        return (D)array[pos-1];
    }
}
