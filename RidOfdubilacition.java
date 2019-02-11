package arrayConcept;

public class RidOfdubilacition {
	private static int count;
	private static boolean dublicate;
  
	public static void main(String[] args) {		
//this is sorted array with duplicate element
//array must be sorted otherwise sort array first
int arr[]={1,1,5,5,5,6,6,6};
int count=1;
for (int i =0; i < arr.length; i=i+count) {
	count=1;
	if(i+1<arr.length)
	if (arr[i]==arr[i+1]) {	
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				 ++count;	}	}	
	  System.out.println("duplicate number "+arr[i]+" is "+count+" time reapet");	
	  }
		
	}
	}
}
