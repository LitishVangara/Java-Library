package cloneMethodPrograms1;

public class CloneExample 
{
	int i;
	public CloneExample() {}
	public CloneExample(int i)
	{
		this.i = i;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return this;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneExample c1 = new CloneExample(70);
		System.out.println("E1 : "+c1.i);
		CloneExample c2 = (CloneExample) c1.clone();
		System.out.println("E2 : "+c2.i);
	}
}
