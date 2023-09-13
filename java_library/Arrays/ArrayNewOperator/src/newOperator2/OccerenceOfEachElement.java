package newOperator2;
import java.util.Scanner;

public class OccerenceOfEachElement {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size : ");
        int size = scan.nextInt();
        System.out.println("-----------------------------------------------------");
        int [] num = new int[size]; 
        int [] count = new int[100];
        int i,temp = 0;
        for(i=0; i < num.length; i++)
        {
            System.out.println("Enter the value for Indexes : "+i);
            num[i] = scan.nextInt();
            if(num[i] == 0)
            {
                break;
            }
        }
        System.out.println("-----------------------------------------------------");
        for(i = 0; i < num.length; i++)
        {
            temp = num[i];
            count[temp]++;
        }
        for(i=1; i < count.length; i++)
        {
            if(count[i] > 0 && count[i] == 1)
            {
            	System.out.println(i+" occurred "+count[i]+" time.");
            }
            else if(count[i] >=2)
            {
                System.out.println(i+" occurred "+count[i]+" times.");
            }
        }
	}
}
