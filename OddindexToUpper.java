package week1.day2;

public class OddindexToUpper {

	public static void main(String[] args) {

		String str = "changeme";
		
		char [] strArr = str.toCharArray();
		
		for (int i = 0; i< str.length();i++)
		{
			if (i%2 == 0)
			{
				System.out.println(Character.toUpperCase(strArr[i]));
			}
			else 
			{
				System.out.println(strArr[i]);
			}
		}

	}

}
