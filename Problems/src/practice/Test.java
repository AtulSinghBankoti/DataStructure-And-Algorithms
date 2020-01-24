package practice;

public class Test {

 	int t() {
 		try {
 			System.out.println("fff");
 			throw new Exception();
 		}catch(Exception e) {
 			return 6;
 		}finally {
 			return 8;
 		}
 	}
	
	public static void main(String[] args) {
		System.out.println(new Test().t());
		
	}

}
