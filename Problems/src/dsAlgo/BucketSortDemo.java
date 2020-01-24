package dsAlgo;

import java.util.ArrayList;
import java.util.List;

public class BucketSortDemo {

	static double []arr={0.5,0.4,0.3,0.22,0.1,0.23};
	
	static ArrayList<ArrayList<Double>> bucket=new ArrayList<>();
	
	
	public static void bucketSort(double arr[]){
		for(int i=0;i<arr.length;i++){
			int v=(int)arr[i]*10;
			if(bucket.isEmpty() || bucket.get(v)==null){
				ArrayList<Double> list=new ArrayList<>();
				list.add(arr[i]);
				bucket.add(list);
			}else{
				List<Double> list=bucket.get(v);
				int p=0;
				for(Double e:list){
					if(arr[i]<=e){
						break;
					}
					p++;
				}
				if(p==list.size()){
					list.add(arr[i]);
				}else{
					list.add(p, arr[i]);
				}
			}
		}
		
		int index=0;
		for(List<Double> l:bucket){
			for(Double e:l){
				arr[index++]=e;
			}
		}
		
	}
	
	public static void main(String[] args) {
		bucketSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		
	}

}
