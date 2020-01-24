package dsAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class HuffmanCodeGreedyDemo {
	
	
	static HuffmanNode root;
	
	public static void insertNode(HuffmanNode node){
		if(root==null){
			root=node;
		}else{
			HuffmanNode newRoot=new HuffmanNode();
			FileChar fileChar2=new FileChar(root.getFileChar().getCh()+node.getFileChar().getCh()
					, root.getFileChar().getFrequency()+node.getFileChar().getFrequency());
			newRoot.setFileChar(fileChar2);
			if(node.getFileChar().getFrequency()>=root.getFileChar().getFrequency()){
				newRoot.setRight(node);
				newRoot.setLeft(root);
			}else{
				newRoot.setLeft(node);
				newRoot.setRight(root);
			}
			root=newRoot;
		}
		
	}
	
	public static void infixOrder(HuffmanNode node){
		if(node!=null){
			infixOrder(node.getLeft());
			System.out.println(node.getFileChar().getFrequency());
			infixOrder(node.getRight());
		}
	}
	
	 static void levelOrder(HuffmanNode node){
		LinkedList<HuffmanNode> list=new LinkedList<>();
		list.push(node);
		System.out.println("here..");
		while(list.size()!=0){
			if(list.get(0)!=null){
				node=list.pop();
				System.out.print(" "+node.getFileChar());
				if(node.getLeft()!=null && node.getRight()!=null){
					list.push(node.getLeft());
					list.push(node.getRight());
				}else if(node.getLeft()!=null){
					list.push(node.getLeft());
				}else if(node.getRight()!=null){
					list.push(node.getRight());
				}
			}
		}
	}
	
	void min_Hipify(ArrayList<FileChar> list,int i,int size){
		int l=0,r=0;
		
		l=i*2+1;
		r=i*2+2;
		
		int minimum=i;
		if(l<size && list.get(l).getFrequency()<list.get(i).getFrequency()){
			minimum=l;
		}
		
		if(r<size && list.get(r).getFrequency()<list.get(minimum).getFrequency()){
			minimum=r;
		}
		if(minimum!=i){
			FileChar fileChar=list.get(i);
			list.set(i, list.get(minimum));
			list.set(minimum, fileChar);
			min_Hipify(list, minimum,size);
		}
	}
		
	void build_Min_heap(ArrayList<FileChar> list){
		for(int i=list.size()/2-1;i>=0;i--){
			min_Hipify(list, i,list.size());
		}
	}
	
	public void heapSort(ArrayList<FileChar> list){
		build_Min_heap(list);
		for(int i=list.size()-1;i>=0;i--){
			FileChar fileChar=list.get(i);
			list.set(i, list.get(0));
			list.set(0, fileChar);
			min_Hipify(list, 0,i);	
		}
	}
		
	
	int getHuffmanBit(ArrayList<FileChar> list){
		build_Min_heap(list);
		int c=0;
		while(!list.isEmpty()){
			heapSort(list);
			HuffmanNode huffmanNode=new HuffmanNode();
			huffmanNode.setFileChar(list.get(list.size()-1));
			insertNode(huffmanNode);
			list.remove(list.size()-1);
			if(list.size()==0){
				list.clear();
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		ArrayList<FileChar> list=new ArrayList<>();
		list.add(new FileChar("a", 40));
		list.add(new FileChar("b", 30));
		list.add(new FileChar("c", 20));
		list.add(new FileChar("d", 5));
		list.add(new FileChar("e", 3));
		list.add(new FileChar("f", 2));	
		ArrayList<FileChar> list2=new ArrayList<>(100);
		for(FileChar ch:list)
			list2.add(ch);
		
		new HuffmanCodeGreedyDemo().getHuffmanBit(list);
		infixOrder(root);
		HuffmanNode r=root;
		for(FileChar ch:list2){
			String s="";
			r=root;
			while(r!=null){
				if(r.getLeft()!=null && r.getLeft().getFileChar().getCh().contains(ch.getCh())){
					s=s+"0";
					r=r.getLeft();
				}else if(r.getRight()!=null && r.getRight().getFileChar().getCh().contains(ch.getCh())){
					s=s+"1";
					r=r.getRight();
				}else{
					break;
				}
			}
			System.out.println(ch.getCh()+">"+s);
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;");
		levelOrder(root);
	}

}

class FileChar{
	private String ch;
	private int frequency;
	private int bits;
	public FileChar(String ch, int frequency) {
		this.ch = ch;
		this.frequency = frequency;
	}
	public int getBits() {
		return bits;
	}
	public void setBits(int bits) {
		this.bits = bits;
	}
	public String getCh() {
		return ch;
	}
	public int getFrequency() {
		return frequency;
	}
	@Override
	public String toString() {
		return  ch+" "+ frequency+" " ;
	}
}

class HuffmanNode{
	private FileChar fileChar;
	private HuffmanNode left;
	private HuffmanNode right;
	public FileChar getFileChar() {
		return fileChar;
	}
	public void setFileChar(FileChar fileChar) {
		this.fileChar = fileChar;
	}
	public HuffmanNode getLeft() {
		return left;
	}
	public void setLeft(HuffmanNode left) {
		this.left = left;
	}
	public HuffmanNode getRight() {
		return right;
	}
	public void setRight(HuffmanNode right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return "l=" + left.getFileChar() + ", r=" + right.getFileChar();
	}
	
	
}
