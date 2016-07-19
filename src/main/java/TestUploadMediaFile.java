// Make sure the downloaded jar file is in the classpath

import org.json.*;

public class TestUploadMediaFile
{
    public static void main(String[] args_)
    {
	      // Specify your login credentials
	      String username = "MyAfricasTalking_Username";
	      String apiKey   = "MyAfricasTalking_APIKey";
	
	      // Specify the url of the file to be uploaded
	      String url = "OnlineFileLocation";
	
	      // Create a new instance of our awesome gateway class
	      AfricasTalkingGateway gateway  = new AfricasTalkingGateway(username, apiKey);
	
	      // Any gateway errors will be captured by our custom Exception class below, 
	      // so wrap the call in a try-catch block
	      try {
	         gateway.uploadMediaFile(url);
	         
	         System.out.println("File upload initiated. Time for song and dance!");
	         
	      } catch (Exception e) {
	          System.out.println("Encountered an error" + e.getMessage());
	     }
	
    }
}