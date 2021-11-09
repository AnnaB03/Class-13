package syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "";
		System.out.println(name.isEmpty());
		//System.out.println(name.isBlank()); // error because we use Java8
		name = "Silva";
		System.out.println(name.isEmpty());
		
		String str="          Batch 11 is ...         ";
		System.out.println(str.trim()); //removes spaces from before and after the characters
		
		String str2 = "This is an easy class";
		System.out.println(str2.toLowerCase().startsWith("t"));
		System.out.println(str2.startsWith("This"));
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.endsWith("S")); //case sensitive
		
		
		

	}

}
