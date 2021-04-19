public class SelectionSort
{
    void selectionSort(int arr[])
    {
        int l=arr.length;
        for(int i=0; i < l; i++)
        {
            int min = i;
            for(int j=i+1; j<l; j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
                                         
            int temp=arr[min];  
            arr[min]=arr[i];
            arr[i]=temp;
                

            
        }
        
    }
    void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
	public static void main(String[] args) {
		SelectionSort m=new SelectionSort();
		int arr[]={30,20,60,66,44,10,34};
		m.selectionSort(arr);
		m.display(arr);
		
	}
}
