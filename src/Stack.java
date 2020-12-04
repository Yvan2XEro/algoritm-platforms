import java.util.ArrayList;

public class Stack {

	private  ArrayList<Integer> list;
	
	private int available;
	private int size;
	
	/**
	 * Constructor
	 * @param size
	 */
	public Stack(int size)
	{
		this.list = new ArrayList<Integer>(size);
		this.available = 0;
		this.size = size;
	}
	
	/**
	 * Pop function allow to remove one element in the stack 
	 * it throws one Exception when the stack is empty
	 * @return
	 * @throws Exception
	 */
	public int pop() throws Exception
	{
		if(!this.list.isEmpty())
		{
			int e = this.list.remove(this.available-1);
			this.available--;
			return e;
		}else {
			throw new Exception("Can't pop empty stack");
		}
	}
	
	/**
	 * To add element in the stack
	 * when it success function return true else it return false
	 * 
	 * @param e
	 * @return
	 */
	public boolean push(int e)
	{
		if(this.available>=this.size)
			return false;
		this.list.add(e);
		this.available++;
		return true;
	}
	
	/**
	 * Get the index of a value in the stack 
	 * function return -1 when the value isn't exist
	 * 
	 * @param int i
	 * @return 
	 */
	public int indexOf(int i)
	{
		return this.list.indexOf(i);
	}

}
