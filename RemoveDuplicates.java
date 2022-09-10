package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str= "We learn java basics as a part of java sessions in java week1";
		int count =0;
		String[] str1 = str.split(" ");
		
		for (int i=0;i<str1.length;i++)
		{
			for (int j=i+1; j<str1.length; j++)
			{
				if (str1[i].equals(str1[j]));
				{
					count++;
					str1[j]="";
					
				}
			}
		}
		if(count>1)
		{
			for (int k =0; k< str1.length; k++)
			{
				System.out.print(str1[k]+ " ");
			}
		}

	}

}
