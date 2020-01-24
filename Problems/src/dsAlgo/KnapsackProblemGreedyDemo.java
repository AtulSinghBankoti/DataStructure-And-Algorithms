package dsAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KnapsackProblemGreedyDemo {
	
	List<KnapsackBag> knapsackBag=new ArrayList<>();
	{
		knapsackBag.add(new KnapsackBag(18, 25));
		knapsackBag.add(new KnapsackBag(15, 24));
		knapsackBag.add(new KnapsackBag(10, 15));		
	}
	
	List<KnapsackBag> getKnapsackBag(int n){
		for(KnapsackBag bag:knapsackBag)
			bag.setProfitPerUnit(bag.getProfit()/bag.getWeight());
		Collections.sort(knapsackBag);
		System.out.println(knapsackBag);
		List<KnapsackBag> result=new ArrayList<>();
		for(KnapsackBag bag:knapsackBag)
			if(bag.getWeight()<n){
				result.add(bag);
				n-=bag.getWeight();
			}else{
				KnapsackBag bag2=new KnapsackBag(n, n*bag.getProfitPerUnit());
				result.add(bag2);
				break;
			}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(new KnapsackProblemGreedyDemo().getKnapsackBag(20).stream()
				.mapToDouble(b->b.getProfit()).sum());
	}
}

class KnapsackBag implements Comparable<KnapsackBag>{
	private double weight;
	private double profit;
	private double profitPerUnit;
	public double getProfitPerUnit() {
		return profitPerUnit;
	}
	public void setProfitPerUnit(double profitPerUnit) {
		this.profitPerUnit = profitPerUnit;
	}
	public KnapsackBag(double weight, double profit) {
		super();
		this.weight = weight;
		this.profit = profit;
	}
	public double getWeight() {
		return weight;
	}
	public double getProfit() {
		return profit;
	}
	@Override
	public int compareTo(KnapsackBag o) {
		return  this.getProfitPerUnit()<o.getProfitPerUnit()?1:-1;
	}
	@Override
	public String toString() {
		return "KnapsackBag [weight=" + weight + ", profit=" + profit + ", profitPerUnit=" + profitPerUnit + "]";
	}	
}



