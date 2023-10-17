import java.util.HashSet;
public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String input = "The quick brown fox jumps over the lazy dog";
		        
		        boolean isPangram = isPangram(input);
		        
		        if (isPangram) {
		            System.out.println("The input is a pangram.");
		        } else {
		            System.out.println("The input is not a pangram.");
		        }
		    }

		    public static boolean isPangram(String input) {
		        input = input.replaceAll(" ", "").toLowerCase();
		        HashSet<Character> uniqueChars = new HashSet<>();
		        
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (Character.isLetter(ch)) {
		                uniqueChars.add(ch);
		            }
		        }
		        
		        // Check if the set contains all 26 letters (A to Z)
		        return uniqueChars.size() == 26;
		    }
}
