package samiralogithm;
import java.util.*;


public class Paymoney {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		  {
		        Scanner in = new Scanner(System.in);
		        int targetvalue1,targetvalue2;
		        System.out.println("Enter the size of transaction array");
		        int N = in.nextInt();
		        in.nextLine();
		        long[] arr = new long[N];
		        System.out.println("Enter the values of array");
		        long[] runninSum = new long[N];
		        for (int i = 0; i < N; i++) 
		        {
		            arr[i] = in.nextLong();
		            if (i == 0)
		                runninSum[i] = arr[i];
		            else
		                runninSum[i] = runninSum[i - 1] + arr[i];
		        }
		        System.out.println("Enter the total no of targets that needs to be achieved");
		        int n=in.nextInt();
		        long sum=0;
		        if(n>1)
		        {
		        for(int j=1;j<=n;j++)
		        {
		        	 sum=arr[0]+arr[j];
		        System.out.println("Enter the value of target");
		        targetvalue1=in.nextInt();
		        if(targetvalue1<=arr[0])
		        {		        	
			        	System.out.println("target  achived after 1 transacction");			        
		        	
		        }
		        else if(targetvalue1<=sum)
		        {
		        	System.out.println("target  achived after 2 transacction");	
		        }
		        
		        
		        }
		        }
		        else
		        {
		        	System.out.println("Enter the value of target");
		        	targetvalue1=in.nextInt();
		        	System.out.println("Given target is not achieved");	
		        }
		        
		    }

		    
		}

			