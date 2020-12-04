
public class Platform {

	/**
	 * The principal matrix
	 */
	Stack[] stackList1;
	
	/**
	 * The intermediate matrix, we will use it to transform  the principal
	 */
	Stack[] stackList2;
	
	
	public Platform(int size)
	{
		this.stackList1 = new Stack[size];
		this.stackList2 = new Stack[size];
		for(int i=0; i<size; i++)
		{
			this.stackList1[i] = new Stack(size);
			this.stackList2[i] = new Stack(size);
		}
	}
	
	public Point findIndexOf(int e)
	{
		int i = 0;
		while(i<this.stackList1.length)
		{
			int j = 0;
			while(this.stackList1[j].indexOf(e)==-1)
				j++;
			
			if(this.stackList1[j].indexOf(e)!=-1)
				return new Point(j, this.stackList1[j].indexOf(e));
			
			i++;
		}
		while(i<this.stackList2.length)
		{
			int j = 0;
			while(this.stackList2[j].indexOf(e)==-1)
				j++;
			
			if(this.stackList2[j].indexOf(e)!=-1)
				return new Point(j, this.stackList2[j].indexOf(e));
			
			i++;
		}
		return new Point(-1,-1);
	}
	
	public boolean putInNextAvailable(int e)
	{
		Point p = this.nextAvailablePoint();
		if(p.isValid()) 
		{
			if(this.stackList2[p.getAbs()].getAvailable() == p.getOrd())
			{
				this.stackList2[p.getAbs()].push(e);
				this.stackList2[p.getAbs()].getList();
				return true;
			}
			else if(this.stackList1[p.getAbs()].getAvailable() == p.getOrd())
			{
				this.stackList1[p.getAbs()].push(e);
				return true;
			}
		}
		return false;
	}
	
	public Point nextAvailablePoint()
	{
		int i = 0;
		Point available = null;
		while(i<this.stackList2.length)
		{
			if(this.stackList2[i].getAvailable()<this.stackList2[i].getSize())
			{
				available = new Point(i, this.stackList2[i].getAvailable());
				break;
			}
			i++;
		}
		
		if(available == null)
		{
			i=0;
			while(i<this.stackList1.length)
			{
				if(this.stackList1[i].getAvailable()<this.stackList1[i].getSize())
				{
					available = new Point(i, this.stackList1[i].getAvailable());
					break;
				}
				i++;
			}
		}
		
		if(available != null)
			return available;
		return new Point(-1, -1);
	}
}
