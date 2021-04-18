import java.util.Scanner;
public class BinarySearch
{
    int binarySearch(int arr[],int s,int l,int r)
    {
        if(l<=r)
        {
            int mid = (l+r)/2;
            if(arr[mid]==s)
            {
                return mid;
            }
            else if(arr[mid]<s)
              return binarySearch( arr, s, mid+1, r);
            else
                return binarySearch( arr, s, l, mid-1);
            
        }
        else
            return -1;
    }
	public static void main(String[] args) {
	    BinarySearch bs=new BinarySearch();
	   
	    
	    int arr[] = {10,20,30,40,50,60,70};
	    int l=0,r=arr.length-1;
	    Scanner sc=new Scanner(System.in);
	    int s=sc.nextInt();
	    
		int result = bs.binarySearch(arr,s,l,r);
		if(result == -1)
		    System.out.println("Not found ");
		else
		     System.out.println(s+" found at index  "+result);
	}
}
