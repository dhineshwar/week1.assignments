package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String str  = "madam";
		String reverse ="";
		
		for (int i = str.length()-1; i>=0; i--)
		{
			reverse  = reverse + str.charAt(i);
		}
		
		if (str.equals(reverse))
		{
			System.out.println("string is palindrome");
		}
		else 
		{
			System.out.println("string is not palindrome");
		}
	}

}
