package gfg.heap;
import java.util.*;

public class HuffmanEncoding {
	
	public ArrayList<String> huffmanCodes(String S, int f[], int N){
		
		PriorityQueue<HuffmanCode> pq = new PriorityQueue<HuffmanCode>((hc1, hc2) -> hc1.data-hc2.data) ;
		for(int i=0; i<f.length; i++) {
			HuffmanCode hc = new HuffmanCode();
			hc.c = S.charAt(i);
			hc.data=f[i];
			pq.add(hc);
		}
		
		System.out.println(pq.toString());
		System.out.println(pq.toArray());
		HuffmanCode root = null;
		while(pq.size()>1) {
			HuffmanCode l = pq.poll();
			HuffmanCode r = pq.poll();
			
			HuffmanCode s = new HuffmanCode();
			s.c = '-';
			s.data = l.data + r.data;
			s.left = l;
			s.right = r;
			root = s;
			pq.add(s);
			System.out.println(pq.toString());
		}
		
		ArrayList<String> list = new ArrayList<String>(); 
		generateCodes(root, "", list);
		
       return list;
    }
	
	
	private void generateCodes(HuffmanCode root, String s, ArrayList<String> list) {

		if(root != null) {

			if(root.left == null && root.right == null && Character.isLetter(root.c)) {
				list.add(s);
			}else {
				generateCodes(root.left, s+"0", list);
				generateCodes(root.right, s+"1", list);
			}		
		}

	}




	public static void main(String[] args) {
		String s = "abcdef";
		int	f[] = {5, 9, 12, 13, 16, 45};
		
		System.out.println(new HuffmanEncoding().huffmanCodes(s, f, 5));

	}

}

class HuffmanCode{
	
	char c;
	int data;
	HuffmanCode left;
	HuffmanCode right;	
}
