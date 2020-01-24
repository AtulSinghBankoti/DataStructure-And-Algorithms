package dsAlgo;

public class LuckyNumber {

	boolean luckeyNumber(int n,int count){
		
		if(count>n)
			return true;
		if(n%count==0)
			return false;
		
		return luckeyNumber(n/count, count++);
	}
	
	public static void main(String[] args) {
		System.out.println(new LuckyNumber().luckeyNumber(7, 2));
	}

}
