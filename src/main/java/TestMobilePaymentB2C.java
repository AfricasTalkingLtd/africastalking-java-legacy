// Make sure the downloaded jar file is in the classpath
import org.json.*;

import java.util.*;

// Make sure the downloaded jar file is in the classpath
public class TestMobilePaymentB2C
{
    public static void main(String[] args_)
    {
	//Specify your credentials
	String username = "MyAfricasTalkingUsername";
	String apiKey   = "MyAfricasTalkingApiKey";
	
	//Create an instance of our awesome gateway class and pass your credentials
	AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey, "sandbox");
	// NOTE: If connecting to the sandbox, please add the sandbox flag to the constructor:
	// AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey, "sandbox");
	
	// Specify the name of your Africa's Talking payment product
	String productName  = "My Online Store";

	// The 3-Letter ISO currency code for the checkout amount
	String currencyCode = "KES";
	
	// Provide the details of a mobile money recipient
	MobilePaymentB2CRecipient recipient1 = new MobilePaymentB2CRecipient("+254718XXXYYY",
									     "KES",
									     10.50);
	recipient1.addMetadata("name", "Clerk");
	recipient1.addMetadata("reason", "May Salary");
	
	// You can provide up to 10 recipients at a time
	MobilePaymentB2CRecipient recipient2 = new MobilePaymentB2CRecipient("+254718YYYXXX",
									     "KES",
									     50.10);
	recipient2.addMetadata("name", "Accountant");
	recipient2.addMetadata("reason", "May Salary");
	
	// Put the recipients into an array
	List<MobilePaymentB2CRecipient> recipients  = new ArrayList<MobilePaymentB2CRecipient>();
	recipients.add(recipient1);
	recipients.add(recipient2);
	try {
	    JSONArray responses = gateway.mobilePaymentB2CRequest(productName, recipients);
	    for( int i = 0; i < responses.length(); ++i ) {
		// Parse the responses and print them out
		JSONObject response = responses.getJSONObject(i);
		System.out.print("phoneNumber=" + response.getString("phoneNumber"));
		String status = response.getString("status");
		System.out.print(";status=" + response.getString("status"));
		if ( status.equals("Queued") ) {
		    System.out.print(";transactionId=" + response.getString("transactionId"));
		    System.out.print(";provider=" + response.getString("provider"));
		    System.out.print(";providerChannel=" + response.getString("providerChannelCode"));
		    System.out.print(";value=" + response.getString("value"));
		    System.out.println(";transactionFee=" + response.getString("transactionFee"));
		} else {
		    System.out.println(";errorMessage=" + response.getString("errorMessage"));
		}
	    }
	    
	}
	catch(Exception ex){
	    System.out.println("Received error response: " + ex.getMessage());
	}
    }
}
