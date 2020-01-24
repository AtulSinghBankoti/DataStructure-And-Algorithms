package practice;

public class DefangingAnIpAddress {
	
	 public String defangIPaddr(String address) {
	        return address.replaceAll("\\.", "[.]");
	        
	    }

	public static void main(String[] args) {
		DefangingAnIpAddress defangingAnIpAddress =new DefangingAnIpAddress();
		String res= defangingAnIpAddress.defangIPaddr("1.1.1.1");
		System.out.println(res);
	}

}
