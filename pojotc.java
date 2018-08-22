package sneha3;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class pojotc {

	@Test
	public void Ts() {
		
		HashMap<String, ArrayList<String>> country = new HashMap<String, ArrayList<String>>();

		ArrayList<String> city = new ArrayList<String>();
		city.add("Mumbai");
		city.add("Delhi");
		city.add("kolkata");

		country.put("India", city);

		// convert from Java Object to JSON string
		String jsonText = JSONValue.toJSONString(country);

		JSONObject person = new JSONObject();
		//person.put("id", "12");
		person.put("firstname", "Jonathan");
		
		person.put("lastname", "Morales");

		JSONObject address = new JSONObject();
		address.put("City", "Bogotá");
		address.put("Street", "Some street");
		person.put("address", address);
		person.put("lastname", "Morales");
        person.put("tours",country );
        
		String jsonString = person.toJSONString();
		//{"address":{"Street":"Some street","City":"Bogotá"},"lastname":"Morales","firstname":"Jonathan"}

		//import static com.jayway.restassured.RestAssured.*;
		RestAssured.given().contentType("application/json")
		      .body(jsonString)
		      .when().post("http://localhost:3000/posts");
		}
	
	
}



