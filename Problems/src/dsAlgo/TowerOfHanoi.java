package dsAlgo;

import java.util.Stack;

public class TowerOfHanoi {

	
	static void toh(int n,char fromTower,char toTower,char helper){
		if(n==1){
			System.out.println("move disk 1 from "+fromTower
					+" to "+toTower);
			return;
		}
		toh(n-1,fromTower,helper,toTower);
		 System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
		toh(n-1,helper,toTower,fromTower);
	}
	
	
	
	public static void main(String[] args) {
		toh(5,'A','B','C');	
	}

}
