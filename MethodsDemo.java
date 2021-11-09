package syntax.class13;

public class MethodsDemo {
	
	int add (int num1, int num2) {
		
		return num1+num2;
	}
	
	int [] doubleArray (int [] arr) {
		//this method will take all elements 
		//and multiply them then return them in arr
		
		//enhanced for loops (:) used only to access the elements - cannot be used
		for (int i=0;i<arr.length;i++) {
			arr [i] = arr [i]*2;
			
		}
		return arr;
	}

}
