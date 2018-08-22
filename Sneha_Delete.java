
package sneha3;
import org.json.simple.JSONObject;
//import static com.jayway.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
class Sneha_Delete{
	@Test
	public void Ts() {
		
JSONObject person = new JSONObject();
//person.put("id", "12");
person.put("firstname", "Jonathan");
person.put("lastname", "Morales");

JSONObject address = new JSONObject();
address.put("City", "Bogotá");
address.put("Street", "Some street");
person.put("address", address);

String jsonString = person.toJSONString();

RestAssured.given().contentType("application/json")
      .body(jsonString)
      .when().post("http://localhost:3000/posts");
}
}