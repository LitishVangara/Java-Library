package addingMergingCommonElement2;

public class NewElementToSpecificIndexMethod4 
{
	public static void main(String[] args) 
	{
		int a[] = {10, 20 ,30};
		int index = 1;
		int element = 50;
		int dup[] = new int[a.length+1];
		int pos = 0;
		for (int i = 0; i < dup.length; i++) 
		{
			if (i!=index) 
			{
				dup[i] = a[pos++];
			}
			else
			{
				dup[i] = element;
			}
		}
		System.out.println("Ater Adding Element : ");
		for (int i = 0; i < dup.length; i++) 
		{
			System.out.print(dup[i]+" ");
		}
		System.out.println();
	}
}
