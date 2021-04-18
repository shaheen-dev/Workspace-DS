
public class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    void display(int arr[])
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]);
        }
    }
	public static void main(String[] args) {
	    int arr[] = {70,30,50,100,10,40};
	    BubbleSort m= new BubbleSort();
	    m.bubbleSort(arr);
	    m.display(arr);
	
	}
}
