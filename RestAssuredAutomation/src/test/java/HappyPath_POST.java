import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class HappyPath_POST extends TestDataSets{
	
	
	//Create a new post.
	@Test(dataProvider = "DataForPost")
	public void createPost(String title, String body, int userId) {
		JSONObject request = new JSONObject();
		request.put("title", title);
		request.put("body", body);
		request.put("userId", userId);
		// System.out.println(request);
		
		//Validate POST request is successful + resource was created. 
		given().
			header("Content-Type", "application/json; charset=UTF-8").
			body(request.toJSONString()).
		when().
			post("https://jsonplaceholder.typicode.com/posts").
		then().
			statusCode(201).
			log().body();
	}
	
	//Create a post comment.
	@Test(dataProvider = "DataForCreateComment")
	public void createPostComment(String name, String email, String body) {
		JSONObject request = new JSONObject();
		request.put("name", name);
		request.put("email", email);
		request.put("body", body);
		// System.out.println(request);
		
		//Validate POST request is successful + resource was created. 
		given().
			header("Content-Type", "application/json; charset=UTF-8").
			body(request.toJSONString()).
		when().
			post("https://jsonplaceholder.typicode.com/posts/{postId}/comments", 1).
		then().
			statusCode(201).
			log().body();	
		
	}
	
	//Add a new photo to a posted album.
	@Test(dataProvider = "DataForPhotoAlbum")
	public void addPhotoToAlbum(String title, String url, String thumbnailUrl) {
		JSONObject request = new JSONObject();
		request.put("title", title);
		request.put("url", url);
		request.put("thumbnailUrl", thumbnailUrl);
		System.out.println(request);
		
		//Validate POST request is successful + resource was created. 
		given().
			header("Content-Type", "application/json; charset=UTF-8").
			body(request.toJSONString()).
		when().
			post("https://jsonplaceholder.typicode.com/albums/{albumId}/photos", 1).
		then().
			statusCode(201).
			log().body();	
	}
}
