package syntax.class13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class methodsDemoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo obj = new MethodsDemo (); //creating an object
		//obj.add(10,10)
		//System.out.println(obj.add(10, 10));
		
		int [] array = {10,10,10};
		
		array=obj.doubleArray(array);
		
		System.out.println(Arrays.toString(array)); //toString use to write all elements w/o loop
		
		

	}

}
