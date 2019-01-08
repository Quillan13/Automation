package autoPack;

import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class creTest {
	
	public void readCre() throws Exception {
		JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("C:\\Users\\quillan.ogle\\eclipse-workspace\\auto\\data\\credentials");
	    System.out.println(jsonObject);
	    System.out.println(jsonObject.get("id"));

	}	
	
	public static Object readJsonSimpleDemo(String filename) throws Exception {  
		FileReader reader = new FileReader(filename);
		JSONParser jsonParser = new JSONParser();
		return jsonParser.parse(reader);
		}	   
		    
	
}

