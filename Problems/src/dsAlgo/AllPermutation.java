package dsAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPermutation {
	static List<String> li=new ArrayList<>();
	void permute(String str,int l){
		if(str.length()==l) {
			li.add(str);
		}else {
			for(int i=l;i<str.length();i++) {
				str=swap(str,l,i);
				permute(str, l+1);
				str=swap(str,l,i);
			}
		}
	}
	
	String swap(String str,int l,int h) {
		char[] ch=str.toCharArray();
		char t=ch[l];
		ch[l]=ch[h];
		ch[h]=t;
		return new String(ch);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a string");
		String s=br.readLine();
		new AllPermutation().permute(s, 0);
		System.out.println(li.size());
		System.out.println(li);
	}

}
