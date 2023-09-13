package stackExamplePrograms1;

import java.util.Stack;

public class StackExaampleProgram 
{
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		s.push(40);
		s.push(89);
		s.push(31);
		s.push(95);
		s.push(18);
		System.out.println(s);
		int a = (int) s.pop();
		System.out.println("Removed Element : "+a);
		System.out.println(a);
		System.out.println("Last Element : "+s.peek());
		System.out.println(s);
		System.out.println("FristIn : "+s.search(40));
		System.out.println("LastIn : "+s.search(95));
		System.out.println(s.search(18));;
	}
}
