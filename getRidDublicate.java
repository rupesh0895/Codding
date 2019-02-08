package arrayConcept;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={4,5,7,7,6,5,4,3};
int m;
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
for (int i = 0, count=0; i < arr.length; i+=count) {
	int j = arr[i];
	 count=0;
	for (int j2 = 0; j2 < arr.length; j2++) {
		if(j==arr[j2]){
			++count;
		}
	}
	int sortarr[]=new int[count];
	for (int k = 0; k < sortarr.length; k++) {
		sortarr[k]=j;
	}
	for (int a : sortarr) {
		System.out.print(a+", ");
	}
	System.out.println();
	//System.out.print(count+" time's ");
	//System.out.println(j);
}
for (int i : arr) {
	System.out.print(i+", ");
}
	}

}
