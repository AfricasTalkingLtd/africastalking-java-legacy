// Make sure the downloaded jar file is in the classpath
import org.json.*;

public class TestNumQueuedCalls
{
    public static void main(String[] args_)
    {
	     // Specify your login credentials
	     String username = "MyAfricasTalking_Username";
	     String apiKey   = "MyAfricasTalking_APIKey";
	
	     // Specify your Africa's Talking phone number in international format
	     String phoneNumber = "+254711082XYZ";
	
	     // Create a new instance of our awesome gateway class
	     AfricasTalkingGateway gateway  = new AfricasTalkingGateway(username, apiKey);
	
	     // Any gateway errors will be captured by our custom Exception class below, 
	     // so wrap the call in a try-catch block
     	try {
	         int queuedCalls = gateway.getNumQueuedCalls(phoneNumber);
	         System.out.println("Number of queued calls: " + queuedCalls);
	         
     	} 
     	
     	catch (Exception e) {
	         System.out.println("Encountered an error" + e.getMessage());
	    }
	
    }
}