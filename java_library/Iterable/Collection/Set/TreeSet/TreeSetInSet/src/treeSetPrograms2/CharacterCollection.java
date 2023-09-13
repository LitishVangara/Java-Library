package treeSetPrograms2;

import java.util.ArrayList;
import java.util.TreeSet;

public class CharacterCollection 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add('A');
		al.add('Z');
		al.add('I');
		al.add('O');
		al.add('V');
		al.add('A');
		al.add('E');
		al.add('U');
		TreeSet ts = new TreeSet(al);
		ArrayList al1 = new ArrayList(ts);
		ArrayList al2 = new ArrayList();
		for (int i = 0; i < al1.size(); i++) 
		{
			char ch = (char) al1.get(i);
			if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) 
			{
				al2.add(ch);
			}
		}
		System.out.println(al2);
	}
}