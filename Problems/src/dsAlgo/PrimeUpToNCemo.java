package dsAlgo;

public class PrimeUpToNCemo {

 	void primeUpToN(int n){
 		if(n>2){
 			System.out.print(2);
 		}
 		for(int i=3;i<=n;i++){
 			boolean prime=true;
 			if(i%2==0)
 				continue;
 			for(int j=2;j<=Math.sqrt(i);j++)
 				if(i%j==0){
 					prime=false;
 					break;
 				}
 			if(prime)
 				System.out.print(" "+i);
 		}
 	}
	public static void main(String[] args) {
		new PrimeUpToNCemo().primeUpToN(10);
	}

}
