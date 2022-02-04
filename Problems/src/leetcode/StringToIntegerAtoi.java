package leetcode;

public class StringToIntegerAtoi {

	 public int myAtoi(String s) {
	 
		char [] chars = s.toCharArray();
		
		boolean isNegative = false;
		boolean numStarted = false;
		boolean symbolDetected = false;
		
		long res =0;
		
		for(int i=0; i<chars.length; i++) {
			
			if(!Character.isDigit(chars[i])) {
				
				if(numStarted) {
					break;
				}
				
				if(chars[i] == '-') {
					if(symbolDetected) {
						return 0;
					}
					isNegative = true;
					symbolDetected = true;
					numStarted = true;
					continue;
				}
				
				
				if(chars[i] == '+') {
					if(symbolDetected) {
						return 0;
					}
					symbolDetected= true;
					numStarted=true;
					continue;
				}
				
				if(chars[i] == ' ') {
					if(!numStarted) {
						continue;
					}
				}
				
				return 0;
			}
			
			numStarted = true;
			res = res * 10 + Character.getNumericValue(chars[i]);
			
			if(isNegative && res > Integer.MAX_VALUE) {
				return Integer.MIN_VALUE;
			}
			
			if(res> Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}	
		}
		
		if(isNegative) {
			res = res * -1;
		}
		
		return (int)res;
		
	 }
	
	public static void main(String[] args) {
		System.out.println(new StringToIntegerAtoi().myAtoi("42"));
		System.out.println(new StringToIntegerAtoi().myAtoi("    -42"));
		System.out.println(new StringToIntegerAtoi().myAtoi("4193 with words"));
		System.out.println(new StringToIntegerAtoi().myAtoi("words and 987"));
		System.out.println(new StringToIntegerAtoi().myAtoi("+1"));
		System.out.println(new StringToIntegerAtoi().myAtoi("20000000000000000000"));
	}

}
