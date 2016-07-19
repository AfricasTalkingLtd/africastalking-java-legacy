// Make sure the downloaded jar file is in the classpath
import org.json.*;
import java.util.HashMap;

// Make sure the downloaded jar file is in the classpath
public class TestMobilePaymentCheckout
{
    public static void main(String[] args_)
    {
	//Specify your credentials
	String username = "MyAfricasTalkingUsername";
	String apiKey   = "MyAfricasTalkingPassword";
	
	//Create an instance of our awesome gateway class and pass your credentials
	AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey, "sandbox");
	// NOTE: If connecting to the sandbox, please add the sandbox flag to the constructor:
	// AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey, "sandbox");
	
	// Specify the name of your Africa's Talking payment product
	String productName  = "My Online Store";
	// The phone number of the customer checking out
	String phoneNumber  = "+254711XXXYYY";
	// The 3-Letter ISO currency code for the checkout amount
	String currencyCode = "KES";
	// The checkout amount
	Double amount       = 100.50;
	// Any metadata that you would like to send along with this request
	// This metadata will be  included when we send back the final payment notification
	HashMap<String, String> metadata = new HashMap<String, String>();
	metadata.put("agentId", "654");
	metadata.put("productId", "321");
	try {
	    // Initiate the checkout. If successful, you will get back a transactionId
	    String transactionId = gateway.initiateMobilePaymentCheckout(productName,
									 phoneNumber,
									 currencyCode,
									 amount,
									 metadata);
	    System.out.println("The transactionId is " + transactionId);
	}
	catch(Exception ex){
	    System.out.println("Received error response: " + ex.getMessage());
	}
    }
}
