package sneha3;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.RestAssured;
//import com.aventstack.extentreport
public class Sneha_Post {

	@Test
		public void TC_2()
		{
			RequestSpecification req = RestAssured.given();
			req.header("Content-Type","application/json");
			
			JSONObject json=new JSONObject();
			json.put("id","22");
			json.put("title","Server7");
			json.put("author","Sneha3");
			
			req.body(json.toJSONString());
			Response resp = req.post("http://localhost:3000/posts");
			
			int code = resp.getStatusCode();
			
			Assert.assertEquals(code, 201);
		}
}
