package dsAlgo;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		ArrayQueue arrayQueue=new ArrayQueue();
		arrayQueue.enqueueElement(10);
		arrayQueue.enqueueElement(20);
		arrayQueue.enqueueElement(30);
		arrayQueue.enqueueElement(40);
		arrayQueue.enqueueElement(50);
		arrayQueue.dequeueElement();
		arrayQueue.dequeueElement();
	}

}

class ArrayQueue{
	private int arr[]=new int[4];
	private int rear=0;
	private int front=0;
	
	public void enqueueElement(int element){
		if((rear+1)%arr.length==0){
			System.out.println("Queue Overflow...!!!!!");
		}else{
			rear++;
			arr[rear]=element;
			System.out.println("Enqueuing element:>"+arr[rear]);
		}
		
	}
	
	public int dequeueElement(){
		if((front+1)%arr.length==0){
			System.out.println("Queue Empty...!!!!!");
			return -1;
		}else{
			front++;
			System.out.println("Dequeuing element:>"+arr[front]);
			return arr[front];
			
		}
	}
	
	
}
