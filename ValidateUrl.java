public class ValidateUrl {
	static String validateurl(String url) {
		//getting the entered url
	String enteredUrl=url.substring(0,5);
	
	   //Condition for checking schemes
	switch(enteredUrl) {
	case "https":
	System.out.println("valid");
			
	case "http":
		System.out.println("valid");
		
	case "ftp":
		System.out.println("valid");
		
	default:
		System.out.println("Invalid");
	
	//Splitting the url
	String [] splitArray=url.split("?");
	
	//will check whether only 2 parameters are passed
	if(splitArray.length==2) {
		System.out.println("valid");
	}
	
	else {
		System.out.println("invalid");
	}
	return url;
	}
	}
	public static void main(String[] args) {
	//reads the input from command line argument
        String enteredUrl=Arrays.toString(args);
	}
        
	}

}
