package newOperator2;

public class OccerenceOfEachElementMethod3 {
	public static void main(String[] args) 
	{
		 int a[]= {13,3,3,6,6,8,2,1,10,5};
		 boolean duplicate=false;
		 for (int i = 0; i <a.length; i++)
		 {
			 for (int j = i+1; j <a.length; j++)
			 {
				 if (a[i]==a[j])
				 {
					 System.out.println("repeated number is found at the index "+i+" :"+a[i]);
					 duplicate=true;	
				 }
			 }	
		 }
		 if (duplicate==false) 
		 {
			 System.out.println("there is no repeated numbers in an array");	
		 }
	}
}
