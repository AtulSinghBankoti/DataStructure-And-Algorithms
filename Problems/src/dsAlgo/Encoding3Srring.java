package dsAlgo;

public class Encoding3Srring {

	public void result(String s1,String s2,String s3){
		String str[][]=new String[3][3];
		if(s1.length()%3==0){
			int i=s1.length()/3;;
			str[0][0]=s1.substring(0, i);
			str[0][1]=s1.substring(i,i+i);
			str[0][2]=s1.substring(i+i,i+i+i);
		}else if(s1.length()%3==1){
			int i=s1.length()/3;;
			str[0][0]=s1.substring(0, i);
			str[0][1]=s1.substring(i,i+i+1);
			str[0][2]=s1.substring(i+i+1,i+i+1+i);
		}else if(s1.length()%3==2){
			int i=s1.length()/3;;
			str[0][0]=s1.substring(0, i+1);
			str[0][1]=s1.substring(i+1,i+1+i);
			str[0][2]=s1.substring(i+1+i,i+1+i+i+1);
		}
		
		
		
		if(s2.length()%3==0){
			int i=s2.length()/3;;
			str[1][0]=s2.substring(0, i);
			str[1][1]=s2.substring(i,i+i);
			str[1][2]=s2.substring(i+i,i+i+i);
		}else if(s2.length()%3==1){
			int i=s2.length()/3;;
			str[1][0]=s2.substring(0, i);
			str[1][1]=s2.substring(i,i+i+1);
			str[1][2]=s2.substring(i+i+1,i+i+1+i);
		}else if(s2.length()%3==2){
				int i=s2.length()/3;;
				str[1][0]=s2.substring(0, i+1);
				str[1][1]=s2.substring(i+1,i+1+i);
				str[1][2]=s2.substring(i+1+i,i+1+i+i+1);
			}
			
		
		
		if(s3.length()%3==0){
			int i=s3.length()/3;;
			str[2][0]=s3.substring(0, i);
			str[2][1]=s3.substring(i,i+i);
			str[2][2]=s3.substring(i+i,i+i+i);
		}else if(s3.length()%3==1){
				int i=s3.length()/3;;
				str[2][0]=s3.substring(0, i);
				str[2][1]=s3.substring(i,i+i+1);
				str[2][2]=s3.substring(i+i+1,i+i+1+i);
		}else if(s3.length()%3==2){
				int i=s3.length()/3;;
				str[2][0]=s3.substring(0, i+1);
				str[2][1]=s3.substring(i+1,i+1+i);
				str[2][2]=s3.substring(i+1+i,i+1+i+i+1);
		}
			
		
		
		

		String input1=str[0][0]+str[1][1]+str[2][2];
		String input2=str[0][1]+str[1][2]+str[2][0];
		String input3=str[0][2]+str[1][0]+str[2][1];
	/*	
		System.out.println(":::::::::::::");
		for(String []s:str){
			for(String st:s){
				System.out.print(st +"   ");
			}
			System.out.println();	
		}
		
		System.out.println(">"+input1);
		System.out.println(">"+input2);
		System.out.println(">"+input3);
	*/	

	}

	
	public static void main(String[] args) {
		new Encoding3Srring().result("john", "johny", "janardhan");
	}

}
