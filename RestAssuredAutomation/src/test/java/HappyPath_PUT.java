import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class HappyPath_PUT extends TestDataSets{
	
	//Update the entire post record.
	@Test(dataProvider = "DataForPost")
	public void updatePost(String title, String body, int userId) {
		JSONObject request = new JSONObject();
		request.put("title", title);
		request.put("body", body);
		request.put("userId", userId);
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
	@Test(dataProvider = "TitleData")
	public void patchPost(String title) {
		JSONObject request = new JSONObject();
		request.put("title", title);
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
