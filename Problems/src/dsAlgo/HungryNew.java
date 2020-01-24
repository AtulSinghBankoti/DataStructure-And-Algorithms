package dsAlgo;

import java.util.concurrent.ArrayBlockingQueue;

public class HungryNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int input1=4;
//		int[] input2= {0,0,1,0};
//		int[] input3 = {1,0,0,0};
		
//		int input1=6;
//		int[] input2= {0,1,1,0,1,0};
//		int[] input3 = {1,1,1,0,1,0};
		
		int input1=5;
		int[] input2= {1,1,0,0,1};
		int[] input3 = {0,0,0,1,0};
		
		ArrayBlockingQueue<Integer> lunchBoxQueue = new ArrayBlockingQueue<Integer>(input1);
		ArrayBlockingQueue<Integer> studentQueue = new ArrayBlockingQueue<Integer>(input1);
		for(int i=0;i<input2.length;i++){
			lunchBoxQueue.add(new Integer(input2[i]));
		}
		for(int j=0;j<input3.length;j++){
			studentQueue.add(new Integer(input3[j]));
		}
		System.out.println("lunchBoxQueue--"+lunchBoxQueue);
		System.out.println("studentQueue--"+studentQueue);
		
		while(!studentQueue.isEmpty() && studentQueue.contains(lunchBoxQueue.element())) {
			try {
				Integer lunchBox = (Integer)lunchBoxQueue.element();
				Integer studentPreferedBox = (Integer)studentQueue.element(); 
				System.out.println("studentPreferedBox-->"+studentPreferedBox);
				System.out.println("lunchBox-->"+lunchBox);
				
				if(lunchBox.intValue()==studentPreferedBox.intValue()) {
					lunchBoxQueue.poll();					
					System.out.println("Both are equal so we are removing this"+studentQueue.poll()+" from queue");	
				}
				else {
					Integer temp = (Integer) studentQueue.element();					
					System.out.println("student is not satisfied with lunch box, so moving this element"+temp+" to the end of queue");	
					studentQueue.poll();
					studentQueue.put(temp);					
				}
				System.out.println("lunchBoxQueue inside--"+lunchBoxQueue);
				System.out.println("studentQueue inside --"+studentQueue);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		System.out.println("size--->"+studentQueue.size());
		
	}

}
