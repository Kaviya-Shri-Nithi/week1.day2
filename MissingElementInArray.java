package week1.day2;

public class MissingElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8}, i=0;
		
		for(int j=1;j<=arr.length;j++)
		{
			if(arr[i]!=j)
			{
				System.out.println(arr[i]);
				break;
			}++i;
		}
				
		}



}
