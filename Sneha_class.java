package sneha3;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
public class Sneha_class {

    @Test
    public void TC_1() {
        RestAssured.baseURI = "http://localhost:3000/posts";
        String response = RestAssured.given().
        when().get().then().extract().asString();
        System.out.println("Response is : " + response);
      
        }
}