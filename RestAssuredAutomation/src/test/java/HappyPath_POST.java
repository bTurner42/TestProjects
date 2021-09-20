import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class HappyPath_POST {
	
	//Create a new post.
	@Test
	public void createPost() {
		JSONObject request = new JSONObject();
		request.put("title", "Deadman's Chest");
		request.put("body", "Yo ho, yo ho, a private's life for me!");
		request.put("userId", 11);
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
	@Test
	public void createPostComment() {
		JSONObject request = new JSONObject();
		request.put("name", "Brittany Turner");
		request.put("email", "brittanymgturner@gmail.com");
		request.put("body", "This was the best movie ever");
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
	@Test
	public void addPhotoToAlbum() {
		JSONObject request = new JSONObject();
		request.put("title", "Aztec necklace");
		request.put("url", "https://via.placeholder.com/600/d32890");
		request.put("thumbnailUrl", "https://via.placeholder.com/150/d32890");
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
