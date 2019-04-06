class LinearList <D> implements List <D>
{
	ListObject <D> head=null;
	ListObject <D> tail=null;
	public void add(D i)
	{
	 	ListObject <D> ob=new ListObject<D>(i);
	 	if(head==null)
	 	{
	 	tail=ob;
		head=ob;
	 	}
	 	else
	 	{
	 	tail.next=ob;
	 	tail=ob;
	 	}
	}
	public void Traverse()
	{
		ListObject <D> obj=head;
		while(obj!=null)
		{
	 	System.out.println(obj.val);
	 	obj=obj.next;
		}
	}
	public void Search(Integer s)
	{
		ListObject <D> obj=head;
		for(Integer i=0;i<s;i++)
		{
			obj=obj.next;
		}
		System.out.println(obj.val);
		System.out.println(" ");
	}
	public void Add(D val,Integer pos)
	{
		try
		{
		if(pos<0)
		{
		BoundException ob=new BoundException();
		throw ob;}
		}catch(BoundException e)
		{
			e.printerror();
		}
		
		ListObject <D> obj=head;
		Listobject <D> current=new ListObject(val);
  		for(Integer i=0;i<pos;i++)
		{ 
		 obj=obj.next;
		}
		current.next=obj.next;
		obj.next=current;
	}
	
}
