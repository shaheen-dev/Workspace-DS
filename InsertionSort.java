public class InsertionSort
{
    void insertionSort(int arr[])
    {
        int l=arr.length;
        for(int i=1; i < l; i++)
        {   
            for(int j=0; j<i; j++)
            {
                if(arr[i]<arr[j])
                {
                   int temp=arr[j];  
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
	public static void main(String[] args)
  {
		InsertionSort m=new InsertionSort();
		int arr[]={20,30,60,66,44,10,34};
		m.insertionSort(arr);
		m.display(arr);
	}
}
