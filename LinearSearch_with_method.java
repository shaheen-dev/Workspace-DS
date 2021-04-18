import java.util.*;
  public class LinearSearch_with_method
{
    int linearSearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
		{
		   
		    if(arr[i]==key)
		        return i;
		}
		return -1;	
    }
	public static void main(String[] args)
	{	    
        LinearSearch_with_method ls=new LinearSearch_with_method();
		    int arr[] = {20,30,40,50,90,10,20};
		    Scanner sc = new Scanner (System.in);
		    int key = sc.nextInt();
	      int result = ls.linearSearch(arr,key);
    
	      if(result ==-1)
	          System.out.println("Key not found");
	      else
	          System.out.println(arr[result] +" Key found at index "+ result);
	}
}
