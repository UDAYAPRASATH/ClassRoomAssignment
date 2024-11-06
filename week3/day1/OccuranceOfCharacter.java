package week3.day1;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

		
		String str="Testleaf";
		int count=0;
		
		
		char arr[]=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='e')
			{
			      count++;
			}
		}
		System.out.println(count);
		
	}

}
