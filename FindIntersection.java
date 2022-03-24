package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

			int arr[]={3,2,11,4,6,7}, arr1[]={1,2,8,4,9,7};
			for(int i=0;i<=arr.length-1;i++)
			{
				for(int j=0;j<=arr.length-1;j++)
				{
					if(arr[i]==arr1[j])
					{
						System.out.println(arr[i]);
						break;
					}
				}
			}

	}

}
