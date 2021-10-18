package RestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostTest {

    @Test
    public void PostMethod(){

        //RestAssured.get("https://reqres.in/api/users?page=2");
        RestAssured.baseURI="http://172.17.225.111:8020/v1/purchase";

        Map<String,String> car = new HashMap<>();
        car.put("telephoneNo", "9999999505");
        car.put("productId", "P02292");
        car.put("type", "BASE");
        car.put("action", "CREATE");
        given().contentType("application/json").body(car).when().post().then().log().all().statusCode(200);

     //   ArrayList<String> basePackage = new ArrayList<String>();
        ArrayList<String> basePackage = new ArrayList();
        basePackage.add("telephoneNo");
        basePackage.add("productId");
        basePackage.add("type");
        basePackage.add("type");

       /* https://www.java67.com/2017/10/java-8-convert-arraylist-to-hashmap-or.html*/

    }
}
