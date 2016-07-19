// Make sure the downloaded jar file is in the classpath
import org.json.*;

public class TestReceiving
{
    public static void main(String[] args_)
    {
	     // Specify your login credentials
	     String username = "MyAfricasTalkingUsername";
	     String apiKey   = "MyAfricasTalkingAPIKey";
	
	     // Create a new instance of our awesome gateway class
	     AfricasTalkingGateway gateway  = new AfricasTalkingGateway(username, apiKey);
	
	    // Our gateway will return 10 messages at a time back to you, starting with
	    // what you currently believe is the lastReceivedId. Specify 0 for the first
	    // time you access the gateway, and the ID of the last message we sent you
	    // on subsequent results
	    int lastReceivedId = 0;
	
	    // Here is a sample of how to fetch all messages using a while loop
	    try {
	       JSONArray results = null;
	       do {
		         results = gateway.fetchMessages(lastReceivedId);
		         for(int i = 0; i < results.length(); ++ i) {
		            JSONObject result = results.getJSONObject(i);
		            System.out.println(result.toString());
		            lastReceivedId = result.getInt("id");
		         }
	       } while ( results.length() > 0 );
	   }
	   
	   catch (Exception e) {
	      System.out.println("Caught an Exception: " + e.getMessage());
   	}
	
	// NOTE: Be sure to save lastReceivedId here for next time
	
	// DONE!!!
    }
}