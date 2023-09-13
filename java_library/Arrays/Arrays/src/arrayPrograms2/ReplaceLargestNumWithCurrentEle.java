package arrayPrograms2;

public class ReplaceLargestNumWithCurrentEle {
	public static void main(String[] args) {
		int arr[] = {12,19,2,4,5,3};
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]<arr[j])
				{
					arr[i] = arr[j];
				}
			}
		}
	    System.out.println("Elements are : ");
	    for (int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]+" ");
	    }
	}
}
