import java.util.Arrays;
public class Test{
	public static void main(String[] args) {
	 	int [] arr= {2, 3, 5,11};
	 	rotateElements(arr);
	 	System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateElements(int[] arr){
		/**
		   Parameters: arr - An array of int value
		**/
		/*	This method is used to rotate all the elements in
		 	   arr one position to the right. 
		  	This rotation will result in arr[0] moving to arr[1] and arr[1] moving to arr[2]
		... etc. Finally, arr[arr.length-1] moves to arr[0].
		*/
		/*
				Notice the issue in class, we are updating the  next value with the previous one
				arr[i+1] =arr[i];
				arr[1] -> arr[0] 
				arr[2] -> arr[1]
				arr[3] -> arr[2]
				arr[4] -> arr[3]
				arr[0] -> arr[arr.length-1]
			    --------------
			 	I'll save the value of the last element
			 	last -> arr[arr.length-1]
			    -----------------
			    Instead started from back 
			    arr[4] -> arr[3]
			    arr[3] -> arr[2]
			    arr[2] -> arr[1]
			    arr[1] -> arr[0] 
			    --- assign the last value to the first element, outside of the for loop
			    arr[0] -> last 
		*/
		int last=arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = last;

	}


}
