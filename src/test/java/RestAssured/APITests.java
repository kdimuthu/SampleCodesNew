package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class APITests {

    @Test
    public void getLstUsers(){
      //RestAssured.get("https://reqres.in/api/users?page=2");
        RestAssured.baseURI="https://reqres.in/api/users?page=2";
        RequestSpecification httpRequest = RestAssured.given();
     //   Response response = httpRequest.get("/7");
        //get the response of element with value as "7" .First data
        Response response = httpRequest.request(Method.GET, "7");
        //Retrieving Body of response
        String body = response.getBody().asString();
        int lengthOfJason=body.length();
        System.out.println("Length is "+lengthOfJason);
        body.hashCode();
       // System.out.println("First element is "+);
        //Retrieving Status Code of response
        int status = response.getStatusCode();
        //Retrieving Status Line
        String statusLine = response.getStatusLine();
        //Retrieving Status Line
        String header = response.header("");
        //Printing the response
        System.out.println("Response Body is "+body);
        System.out.println("Status code is "+status);
        System.out.println("Status line is "+statusLine);

        String jsonPathEvaluator = response.jsonPath().getString("id");

        System.out.println("Id received from response "+jsonPathEvaluator);

        httpRequest.given().when().get("/7").then().statusCode(200);

     //   JSONObject requestParams = new JSONObject();

/*
        List <Object> allInformation=RestAssured.get("https://reqres.in/api/users?page=2").as(List.class);
      //  System.out.println("Size is "+allInformation.size());
        Map<String,Object> emp1=(Map<String,Object>) allInformation.get(0);
        System.out.println(emp1.get("id"));
*/



    }
}
