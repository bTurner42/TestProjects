import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class HappyPath_GET {
	
	//GET a specified post.
	@Test
	void getAResource() {
		given().
			get("https://jsonplaceholder.typicode.com/posts/1").
		then().
			statusCode(200).
			log().body();
	}
	
	//GET a list of all posts.
	@Test
	void listAllResources()
	{
		given().
			get("https://jsonplaceholder.typicode.com/posts").
		then().
			statusCode(200).
			log().body();
	}
}
