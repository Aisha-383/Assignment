
public class roman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String romanNumeral = "VI";

		        int result = romanToInt(romanNumeral);
		        System.out.println(romanNumeral + " = " + result);
		    }

		    public static int romanToInt(String s) {
		        int result = 0;
		        int prevValue = 0;

		        for (int i = s.length() - 1; i >= 0; i--) {
		            char c = s.charAt(i);
		            int value = getRomanValue(c);

		            if (value < prevValue) {
		                result -= value;
		            } else {
		                result += value;
		            }

		            prevValue = value;
		        }

		        return result;
		    }

		    public static int getRomanValue(char c) {
		        switch (c) {
		            case 'I':
		                return 1;
		            case 'V':
		                return 5;
		            case 'X':
		                return 10;
		            case 'L':
		                return 50;
		            case 'C':
		                return 100;
		            case 'D':
		                return 500;
		            case 'M':
		                return 1000;
		            default:
		                return 0;
		        }
		    }
		

	

}
