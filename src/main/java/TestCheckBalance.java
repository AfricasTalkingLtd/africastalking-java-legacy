// Make sure the downloaded jar file is in the classpath

import org.json.*;

public class TestCheckBalance 
{

	public static void main(String[] args) 
	{
		
		//Specify your credentials
		String username = "myAfricasTalkingUsername";
		String apiKey = "myAfricasTalkingAPIKey";
		
		//Create an instance of our awesome gateway class and pass your credentials
		AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);
		
		// Thats it, hit send and we'll take care of the rest. Any errors will
   // be captured in the Exception class as shown below
   
   try {
   	JSONObject result = gateway.getUserData();
   	System.out.println(result.getString("balance"));
   	//The result will have the format=> KES XXX
   }
   
   catch(Exception e){
   	System.out.println(e.getMessage());
   }
	}
}