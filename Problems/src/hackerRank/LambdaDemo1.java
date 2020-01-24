package hackerRank;

public class LambdaDemo1 {

	private static void print(Animal animal, CheckTrait checkTrait) {
		if(checkTrait.test(animal))
			System.out.println(animal);
	}
	
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a->a.canHop());
		print(new Animal("kangaroo", true, false), a->a.canHop());
	}

}

class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String species, boolean canHop, boolean canSwim) {
		super();
		this.species = species;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop() {return canHop;}
	
	public boolean canSwim() {return canSwim;}
	
	public String toString() {return species;}
}


interface CheckTrait {
	public boolean test(Animal a);
}





