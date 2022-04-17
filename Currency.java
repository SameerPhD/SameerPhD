package samiralogithm;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int cursize;
		int amount;
		int temp;
		int i;
		int sum=0;
		
		
		System.out.println("Enter the size of currency denominations");
		cursize=sc.nextInt();
		System.out.println("Enter the currency denominations value");
		int[]curvalue=new int[cursize];
		int arr[]=new int[cursize];
		for(i=0;i<cursize;i++)
		{
		curvalue[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		amount=sc.nextInt();
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int j=0;j<cursize;j++)
		{
			for(i=0;i<cursize;i++)
			{
				if(curvalue[i]>curvalue[j])
				{
					temp=curvalue[i];
					curvalue[i]=curvalue[j];
					curvalue[j]=temp;
				}
				//System.out.println("sum="+curvalue[i]);
			}
			
		}
		int count=1;
		int t=amount-curvalue[cursize-1];
		for(i=0;i<cursize;i++)
		{
			
			if(t<=curvalue[i])
			{
				count++;//System.out.println("sum="+t);
			}
			
		}
		System.out.println(curvalue[cursize-1]+":"+"1");
		System.out.println(curvalue[0]+":"+count);
		
	}

}
