package hackerRank;

import java.math.BigInteger;

import org.junit.Assert;

public class ExtraLongFactorials {

    static	BigInteger res=null;
	
	static void extraLongFactorials(int n) {
		BigInteger bigInt =  new BigInteger("1");
		
		
		for(int i=1; i<=n; i++) {
			bigInt= bigInt.multiply(new BigInteger(""+i));  
		}
		
		System.out.println(bigInt);
		//res = bigInt;
	}



	public static void main(String[] args) {
		extraLongFactorials(25);
		Assert.assertEquals("15511210043330985984000000",res.toString());

	}

}
