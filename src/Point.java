
public class Point {
	private int abs;
	private int ord;
	
	public Point(int abs, int ord)
	{
		this.abs	= abs;
		this.ord	= ord;
	}
	public int getAbs()
	{
		return this.abs;
	}
	public int getOrd()
	{
		return this.ord;
	}
	public Point setAbs(int abs)
	{
		this.abs	= abs;
		return this;
	}
	public Point setOrd(int ord)
	{
		this.ord	= ord;
		return this;
	}
	public String toString()
	{
		return "( "+this.abs+", "+this.ord+" )";
	}
	public boolean isValid()
	{
		return this.abs>=0 && this.ord>=0;
	}
}
