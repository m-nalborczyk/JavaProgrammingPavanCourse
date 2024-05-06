package Extra;

public class PalindromeString {
	
	public static void main(String[] args) {
			
				String word = "DAD";
				
				//1. using for loop 
				int len = word.length(); //7
				String rev = "";
				
				for(int i =len-1; i>=0; i--){
					rev = rev + word.charAt(i); //muineleS
				}
				
				System.out.println(rev);
				
				if(word.equals(rev))
				{
					System.out.println("Palindrome string");
				}
				else
				{
					System.out.println("Not Palindrome string");
				}

				
				//2. using StringBuffer class:
				//StringBuffer sbWord = new StringBuffer(word);
				//System.out.println(sbWord.reverse());
	}
	
	
}