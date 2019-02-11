/*
 * Created by rupesh kumar singh 11/2/2019
 * 
 */

package arrayConcept;
import java.util.Scanner;
public class CheckDivisibility {
	static int countindex=0;
	 static int[] permute(int[] a,int[] p, int k) 
	    {
	        if (k == a.length) 
	        {
	        	int num=0;
	            for (int i = 0; i < a.length; i++) 
	            {
	               
	            	num=num*10+a[i];
	            	
	            }
	            p[countindex]=num;
	            ++countindex;
	           // System.out.println(num);
	        } 
	        else 
	        {
	            for (int i = k; i < a.length; i++) 
	            {
	                int temp = a[k];
	                a[k] = a[i];
	                a[i] = temp;
	 
	                permute(a,p, k + 1);
	 
	                temp = a[k];
	                a[k] = a[i];
	                a[i] = temp;
	            }
	        }
			return p;
	    }
	public static int factorial(int n){
		int temp=n;
		for (int i = 1; i < temp; i++) {
			n*=i;
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner st=new Scanner(System.in);
	System.out.print("Enter Numper :");
		int num=st.nextInt();
		int temp=num;
		//find the number of length of given digits
		String str=Integer.toString(num);
		int size=str.length();//Integer.parseInt(str.length());
		int arr[]=new int[size];
		int n=size-1;
		
		// Seperating the give number in unit digits within arr[]
		while (temp>0) {
			int rem=temp%10;
			arr[n]=rem;
			temp=temp/10;
			--n;
		}
		
		int factorial=factorial(size);
		 int _Purmutation_series[]=new int[factorial];
		//System.out.println(factorial);
		int chek[]=  permute(arr,_Purmutation_series, 0);
		System.out.println("Permutation numbers of "+num+" is P=");
		for (int i : chek) {
			System.out.print("["+i+"]");
		}
		System.out.println("\nthose number which is divisibility by 8 p%8=");
		
		for (int i : chek) {
			if(i%8==0)
			System.out.println("["+i+"]");
		}
		
	}

}
