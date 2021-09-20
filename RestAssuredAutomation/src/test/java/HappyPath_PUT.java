import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class HappyPath_PUT {
	
	//Update the entire post record.
	@Test
	public void updatePost() {
		JSONObject request = new JSONObject();
		request.put("title", "Curse of the Black Pearl");
		request.put("body", "The ship needs a captain");
		request.put("userId", 11);
		// System.out.println(request);
		
		//Validate PUT request is successful + resource is updated. 
		given().
			header("Content-Type", "application/json; charset=UTF-8").
			body(request.toJSONString()).
		when().
			put("https://jsonplaceholder.typicode.com/posts/{postId}", 1).
		then().
			statusCode(200).
			log().all();
	}
	
	//Partially update a post.
	@Test
	public void patchPost() {
		JSONObject request = new JSONObject();
		request.put("title", "Davey Jones Locker");
		// System.out.println(request);
		
		//Validate PATCH request is successful + resource was updated. 
		given().
			header("Content-Type", "application/json; charset=UTF-8").
			body(request.toJSONString()).
		when().
			patch("https://jsonplaceholder.typicode.com/posts/{postId}", 1).
		then().
			statusCode(200).
			log().all();
	}
}
