
package sneha3;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import io.restassured.RestAssured;
//import com.aventstack.extentreport
public class delete {

	@Test
		public void TC_2()
		{
			RequestSpecification req = RestAssured.given();
			req.header("Content-Type","application/json");
			
			
			Response resp = req.delete("http://localhost:3000/posts/3");
			
}
}