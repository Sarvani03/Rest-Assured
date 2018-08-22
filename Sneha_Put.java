package sneha3;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.RestAssured;
public class Sneha_Put {

	@Test
	public void TC_3()
	{
		RequestSpecification req = RestAssured.given();
		req.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("title","hey");
		json.put("author","seeta");
		
		req.body(json.toJSONString());
		Response resp = req.put("http://localhost:3000/posts/21");
		
		int code = resp.getStatusCode();
		
		Assert.assertEquals(code, 200);
	}
}
