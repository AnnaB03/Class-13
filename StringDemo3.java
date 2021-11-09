package syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "This class is easy";
		System.out.println(name.contains("class"));
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		
		String str2 = "Hello";
		String str3 = "hellovfvbhglgv";
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		//System.out.println(str2.charAt(21)); // error
		System.out.println(str2.charAt(2));
			System.out.println(str2.toUpperCase().charAt(2));
		System.out.println(str2.indexOf('l',2)); // start from index #2
		System.out.println(str3.indexOf('l', str3.indexOf('l')+1)); //start from 'l'+1 character
		
		System.out.println(name.substring(5)); //ignore the first 5 letters
		System.out.println(name.substring(5,11));
		
	}

}
