package practice;

/*
 * link: https://leetcode.com/problems/convert-to-base-2/
 * 
 */

public class ConvertToBase2 {

	 public String baseNeg2(int N) {
		 return Integer.toBinaryString(N);    
	  }
	
	public static void main(String[] args) {
		ConvertToBase2 base2 =new ConvertToBase2();
		System.out.println(base2.fromDeci(62, 1292));

	}

	
	static char reVal(int num) 
	{ 
	    if (num >= 0 && num <= 9) 
	        return (char)(num + 48); 
	    else
	        return (char)(num - 10 + 65); 
	} 
	  
	// Function to convert a given decimal number 
	// to a base 'base' and 
	static String fromDeci(int base1, int inputNum) 
	{ 
	    String s = ""; 
	  
	    // Convert input number is given  
	    // base by repeatedly dividing it 
	    // by base and taking remainder 
	    while (inputNum > 0) 
	    { 
	        s += reVal(inputNum % base1); 
	        inputNum /= base1; 
	    } 
	    StringBuilder ix = new StringBuilder();  
	  
	        // append a string into StringBuilder input1  
	        ix.append(s);  
	  
	    // Reverse the result 
	    return new String(ix.reverse()); 
	} 
	  
}
