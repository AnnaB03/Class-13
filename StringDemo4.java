package syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is Batch 11. Batch 11 is great";
		String [] arr = str.split("[.]");
		
		System.out.println(arr[0]); //will split the word #2
		
		
		
		/*for (String word:arr) {
			System.out.println(word); //will split all the words
		}*/
 
	}

}
