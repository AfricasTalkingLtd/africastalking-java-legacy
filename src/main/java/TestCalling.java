// Make sure the downloaded jar file is in the classpath
import org.json.*;

public class TestCalling
{
    public static void main(String[] args_)
    {
	     // Specify your login credentials
	     String username = "MyAfricasTalking_Username";
	     String apiKey   = "MyAfricasTalking_APIKey";
	
	     // Specify your Africa's Talking phone number in international format
	     String from = "+254711082XYZ";
	
	     // Specify the numbers that you want to call to in a comma-separated list
	     // Please ensure you include the country code (+254 for Kenya in this case)
     	String to   = "+254711XXXYYYZZZ,+254733XXXYYYZZZ";
	
	     // Create a new instance of our awesome gateway class
	     AfricasTalkingGateway gateway  = new AfricasTalkingGateway(username, apiKey);
	
	     // Any gateway errors will be captured by our custom Exception class below, 
	     // so wrap the call in a try-catch block
     	try {
	         gateway.call(from, to);
	         System.out.println("Calls have been initiated. Time for song and dance!");
	         // Our API will now contact your callback URL once the recipient answers the call!
     	} 
     	
     	catch (Exception e) {
	         System.out.println("Encountered an error" + e.getMessage());
	    }
	
    }
}