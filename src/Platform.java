
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
	}
}
