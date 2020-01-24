package dsAlgo;


import java.util.LinkedList;
import java.util.Stack;

public class EatLunch {

	int eatLunch(int []lunchBox,int stu[]){
		Stack<Integer> stack=new Stack<>();
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0,j=lunchBox.length-1;i<stu.length;i++,j--){
			stack.push(lunchBox[j]);
			list.add(stu[i]);
		}
		
		while(!list.isEmpty() && list.contains(stack.peek())){
				if(list.get(0)==stack.peek()){
					list.remove(0);
					stack.pop();
				}else{
					list.add(list.get(0));
					list.remove(0);
				}
		}
		
		return list.size();
	}
	
	public static void main(String[] args) {
		System.out.println(new EatLunch().eatLunch(new int[]{1,1,0,0,1},new int[]{0,0,0,1,0}));
		System.out.println(new EatLunch().
				eatLunch(new int[]{0,1,1,0,1,0},new int[]{1,1,1,0,1,0}));
		System.out.println(new EatLunch().
				eatLunch(new int[]{0,0,1,0},new int[]{1,0,0,0}));
	}

}
