package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StatisticsFromLargeSample {

	
	public double[] sampleStats(int[] count) {
		
		List list = Arrays.stream(count).sorted().mapToObj(e->e).collect(Collectors.toList());
		
		//System.out.println(list);
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Object e : list) {
			if(map.containsKey(e)) {
				map.put((Integer)e, map.get(e)+1);
			}else {
				map.put((Integer)e, 1);
			}
		}
		
		IntSummaryStatistics summary = list.parallelStream().mapToInt(e -> (Integer)e).summaryStatistics();
		
		System.out.println("sum:>"+summary.getSum());
		System.out.println("count:>"+summary.getCount()+ " listsize:"+list.size());
		
		
		double min = summary.getMin();
		
		System.out.println("min:>"+min);
		double max = summary.getMax();
		
		System.out.println("max:>"+max);
		
		double mean = summary.getAverage();
		
		System.out.println("mean:>"+mean);
		double median = (double)(int) list.get((list.size()+1)/2);
		
		System.out.println("median:>"+median);
		
		double mode = 0;
		double p=0;
		
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > p) {
				p = entry.getValue();
				mode = entry.getKey();
			}
		}
		
		System.out.println("mode:>"+mode); 
		
		return new double[] {min, max, mean, median, mode};
    }
	
	
	public static void main(String[] args) {
		
		int [] input = new int[] {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//[1.0,3.0,2.375,2.5,3.0]
	System.out.println(Arrays.toString(new StatisticsFromLargeSample().sampleStats(input)));

	}

}
