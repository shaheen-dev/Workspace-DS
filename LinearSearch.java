import java.util.Scanner;
public class LinearSearch
{
	public static void main(String[] args) {

		int shao[] = {20,30,40,50,90,10,20};
		Scanner sc = new Scanner (System.in);
		int key = sc.nextInt();
	    int l = shao.length-1;
	    
		for(int i=0;i<shao.length;)
		{
		    if(key != shao[i])
		        {
		            if(i == l){
		                System.out.println("Key value not found "+key);
		                break;
		            }else
		                i++;
		        }

		    else{
		        System.out.println("Key value found "+key);
		        break;
		    }
		}
	}
}
