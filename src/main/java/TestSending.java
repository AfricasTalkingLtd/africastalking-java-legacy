// Make sure the downloaded jar file is in the classpath
import org.json.*;
import java.util.HashMap;

// Make sure the downloaded jar file is in the classpath
public class TestSending
{
    public static void main(String[] args_)
    {
	     // Specify your login credentials
	     String username = "MyUsername";
	     String apiKey   = "MyAPIKey";
	
	     // Specify the numbers that you want to send to in a comma-separated list
	     // Please ensure you include the country code (+254 for Kenya in this case)
	     String recipients = "+254711XXXYYY,+254733YYYZZZ";
	
	     // And of course we want our recipients to know what we really do
	     String message = "We are lumberjacks. We code all day and sleep all night";
	
	    // Create a new instance of our awesome gateway class
	     AfricasTalkingGateway gateway  = new AfricasTalkingGateway(username, apiKey);
	
	     // Thats it, hit send and we'll take care of the rest. Any errors will
	     // be captured in the Exception class below
	    try {
	        JSONArray results = gateway.sendMessage(recipients, message);
	        for( int i = 0; i < results.length(); ++i ) {
		          JSONObject result = results.getJSONObject(i);
		          System.out.print(result.getString("status") + ",");
		          System.out.print(result.getString("number") + ",");
		          System.out.print(result.getString("messageId") + ",");
		          System.out.println(result.getString("cost"));
	    }
   	}
   	
   	catch (Exception e) {
	    System.out.println("Encountered an error while sending " + e.getMessage());
	    }
	
   }
}
