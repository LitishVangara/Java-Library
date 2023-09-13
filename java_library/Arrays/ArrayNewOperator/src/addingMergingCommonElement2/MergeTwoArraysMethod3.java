package addingMergingCommonElement2;

public class MergeTwoArraysMethod3 
{
	public static void main(String[] args) 
	{
		int a[] = {10,22,14,36,77,97};
		int b[] = {34,67,92,32,46,56};
		int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;
        int[] c = new int[c1];
        for (int i = 0; i < a1; i = i+1) 
        {
            c[i] = a[i];
        }
        for (int i = 0; i < b1; i = i+1) 
        {
            c[a1 + i] = b[i];
        }
        for (int i = 0; i < c1; i = i+1) 
        {  
            System.out.print(c[i]+" ");
        }
	}
}
