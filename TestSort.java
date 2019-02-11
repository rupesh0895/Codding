/*Created by rupesh singh
*
*/

package arrayConcept;
import java.util.Scanner;
public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////use this for take array 'arr' from user whit size 'n'
//Scanner st=new Scanner(System.in);	
////n element of array
//int n=st.nextInt();
//int arr[]=new int[n];
//for (int i = 0; i < n; i++){
//arr[i]=st.nextInt();}	

		//or ittration array
int arr[]={4,5,7,7,6,5,7,4,3};
int m;
//sorting the array
for (int i = 0; i < arr.length; i++) {
	for (int j = i; j < arr.length; j++) {
		int temp=arr[i];
		if(temp>arr[j]){
			//swap it
			m=arr[j];
			arr[j]=arr[i];
			arr[i]=m;
		
		}
		
	}
	
}
//actual sorting array
//for (int i : arr) {
//	System.out.print(i+", ");
//}
int len=0;
for (int i = 0, count=0; i < arr.length; i+=count) {
	
	 count=0;
	for (int j2 = 0; j2 < arr.length; j2++) {
		if(arr[i]==arr[j2]){
			++count;
		   }
		
	    }
	
	len+=1;
}
/*
 * 1.create a jagged array { array of array} which each row contain repeated number array
 * 2.example a[][] is jagged array 
 * a[0][]={3},   a[1][]={4,4},   a[2][]={5,5},   a[3][]={6}, a[4][]={7,7}
 * 
 */

int a[][] = new int[len][]; 
int index=0;
for (int i = 0, count=0; i < arr.length; i+=count) {
int j;
 count=0;
for (int j2 = 0; j2 < arr.length; j2++) {
	if(arr[i]==arr[j2]){
		++count;
	   }
	
    }

int sortarr[]=new int[count];
for (int k = 0; k < sortarr.length; k++) {
	sortarr[k]=arr[i];
}
a[index]=sortarr;
++index;

}


//using bubble sort concept to arrange the jagged array 
for(int i=0; i<a.length; i++){
  for(int j=0; j<a.length-i-1; j++)
  {
    if( a[j].length > a[j+1].length)
    {
    	int temp[]=new int[a[j].length];
       temp = a[j];
      a[j] = a[j+1];
      a[j+1] = temp;
    } 
  }
}


//System.out.println(".............................");//new line 
//printing the data of a jagged array   
for (int i=0; i<a.length; i++){ 
	System.out.print("{");
    for (int j=0; j<a[i].length; j++){ 
        System.out.print(" "+a[i][j]+" ");  
    }  
    System.out.print("} ");
   // System.out.println();//new line  
}


	}

}
