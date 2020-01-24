package dsAlgo;

public class ThePalindromeGame {

	public String game(String input1){
		String maxSubStr="";
		for(int i=0;i<input1.length();i++){
			int p1=i-1,p2=i+1;
			String s=""+input1.charAt(i);
			while(p1>=0 || p2<input1.length()){
				boolean flag=false;
				if(p1>=0){
					flag=true;
					s=""+input1.charAt(p1)+s;
					p1--;
				}
				
				StringBuilder sb=new StringBuilder(s);
				if(s.equals(sb.reverse().toString()) && s.length()>maxSubStr.length()){
					maxSubStr=s;
				}
				
				if(p2<input1.length()){
					s=s+""+input1.charAt(p2);
					p2++;
				}
				
				sb=new StringBuilder(s);
				if(s.equals(sb.reverse().toString()) && s.length()>maxSubStr.length()){
					maxSubStr=s;
				}
				
				if(flag){
					String tmp=s.substring(1, s.length());
					sb=new StringBuilder(tmp);
					if(tmp.equals(sb.reverse().toString()) && tmp.length()>maxSubStr.length()){
						maxSubStr=tmp;
					}
				}
				flag=false;
			}
		}
		
		
		return maxSubStr;
	}
	
	public static void main(String[] args) {
		System.out.println(new ThePalindromeGame()
				.game("123434532455321"));
		
		System.out.println(new ThePalindromeGame()
				.game("ACGTGTCAAAATCG"));
		

	}

}
