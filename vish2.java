import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Readjson {

	public static void main(String[] args) throws IOException, ParseException,
		    org.json.simple.parser.ParseException {

		        JSONParser jsonparser = new JSONParser();

		        FileReader reader = new FileReader("JSON\\student.json");

		        Object obj = jsonparser.parse(reader);

		        JSONObject studentobj = (JSONObject) obj;

		        String fname = (String) studentobj.get("firstname");
		        String lname = (String) studentobj.get("lastname");

		        System.out.println("Firstname : " + fname);
		        System.out.println("Lastname : " + lname);

		    }
		// TODO Auto-generated method stub

	}
