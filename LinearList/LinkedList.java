class LinkedList<D> implements Listt<D>
{
	ListObject<D> head=null;
	ListObject<D> tail=null;

	public void add(D x)
	{
		ListObject <D> ob=new ListObject<D>(x);
		if(head==null)
		{
			head=ob;
			tail=ob;
		}
		else
		{
			tail.next=ob;
			tail=ob;
		}
	}
	public void add(D x,Integer pos)
	{
		ListObject<D> obj=head;
		ListObject<D> current=new ListObject<D>(x);
		for(Integer i=0;i<pos-1;i++)
		{
			obj=obj.next;
		}
		current.next=obj.next;
		obj.next=current;
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
	public void ElementAt(Integer x)
	{
		ListObject <D> obj=head;
		for(Integer i=0;i<x-1;i++)
		{
			obj=obj.next;
		}
		System.out.println(obj.val);
	}
	public void Search(Integer x)
	{
		Integer i=-1;
		ListObject <D> obj=head;
		while(obj!=null)
		{
			 i++;
			if(obj.val==x)
			System.out.println(i);
		else
		obj=obj.next;
		}
	}
	public void Reverse()
	{
		ListObject<D> prev=null;
		ListObject<D> ne=null;
		ListObject<D> obj=head;
		while(obj!=null)
		{
			ne=obj.next;
			obj.next=prev;
			prev=obj;
			obj=ne;
		}
		head=prev;
		ListObject<D> os=head;
		while(os!=null)
		{
			System.out.println(os.val);
			os=os.next;
		}
	}
}
