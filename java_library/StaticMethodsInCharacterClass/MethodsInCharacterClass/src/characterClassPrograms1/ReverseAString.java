package characterClassPrograms1;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		String s = "we one java developers";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println("After Reversing : "+sb);
	}
}
