
public class chop {
public static int chop1(int[] arr,int a) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int middle=(start+end)/2;
		if(arr[middle]<a) {
			start=middle+1;
		}
		else if(arr[middle]>a) {
			end=middle-1;
		}
		else return middle;
	}
	return -1;
	
}
public static int chop2(int[] arr,int start,int end,int a) {
	
	int middle=(start+end)/2;
	if(start>end) return -1;
	if(arr[middle]<a) {
			start=middle+1;
			return chop2(arr,start,end,a);
		}
		else if(arr[middle]>a) {
			end=middle-1;
			return chop2(arr,start,end,a);
		}
		else return middle;
}
public static int chop3(int[] arr,int a) {
	int start=0;
	int end=arr.length-1;
	for(int middle=(start+end)/2;start<=end;middle=(start+end)/2) {
		
		if(arr[middle]<a) {
			start=middle+1;
		}
		else if(arr[middle]>a) {
			end=middle-1;
		}
		else return middle;
	}
	return -1;
}

	public static void main(String[] args) {
	    int[] arr = new int[] { 1,4,25,64,77,89 };
	    System.out.println(chop3(arr,1));
	    System.out.println(chop3(arr,4));
	    System.out.println(chop3(arr,25));
	    System.out.println(chop3(arr,89));
	}
}
