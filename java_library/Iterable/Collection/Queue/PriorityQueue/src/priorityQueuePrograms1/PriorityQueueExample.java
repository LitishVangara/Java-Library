package priorityQueuePrograms1;

import java.util.PriorityQueue;

public class PriorityQueueExample 
{
	public static void main(String[] args) 
	{
		PriorityQueue p = new PriorityQueue();
		p.add(83);
		p.add(26);
		p.add(100);
		p.add(73);
		p.add(16);
		System.out.println(p);
		p.add(73);
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}
}
