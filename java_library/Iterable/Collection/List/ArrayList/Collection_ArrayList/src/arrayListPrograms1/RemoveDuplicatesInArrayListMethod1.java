package arrayListPrograms1;
import java.util.ArrayList;

public class RemoveDuplicatesInArrayListMethod1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);
		for(int i=0;i<al.size();i++)
		{
			 if(!al1.contains(al.get(i)))
			 {
				 al1.add(al.get(i));
			 }
		}
		System.out.println("Before Removing Duplicates : "+al);
		System.out.println("After Removing Duplicates : "+al1);
	}
}
