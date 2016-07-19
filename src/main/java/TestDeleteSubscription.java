// Make sure the downloaded jar file is in the classpath
public class TestDeleteSubscription 
{

	public static void main(String[] args) 
	{
		
		//Specify your credentials
		String username = "myAfricasTalkingUsername";
		String apiKey = "myAfricasTalkingAPIKey";
		
		// Specify the number that you want to add
	// Please ensure you include the country code (+254 for Kenya in this case)
	String subscriptionPhoneNumber   = "+254711YYYZZZ";
	
	//Specify your Africa's Talking short code and keyword
	String shortCode = "myAfricasTalkingShortCode";
	String keyword   = "myAfricasTalkingKeyword";
		
		//Create an instance of our awesome gateway class and pass your credentials
		AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);
		
		// Thats it, submit data and we'll take care of the rest. Any errors will
   // be captured in the Exception class as shown below
   
   try {
    JSONObject result = gateway.createSubscription(subscriptionPhoneNumber, shortCode, keyword);
    
    //Only status Success signifies the subscription was successfully
    System.out.println(result.getString("status"));
    System.out.println(result.getString("description"));
   }
   catch(Exception e){
   	System.out.println(e.getMessage());
   }
	}
}