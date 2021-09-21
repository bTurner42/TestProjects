import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class HappyPath_GET extends TestDataSets {
	
	//GET a specified post.
	@Test(dataProvider = "PostIdData")
	void getPost(int postId) {
		given().
			get("https://jsonplaceholder.typicode.com/posts/{postId}", postId).
		then().
			statusCode(200).
			log().body();
	}
	
	//GET a list of all posts.
	@Test
	void listAllPosts()
	{
		given().
			get("https://jsonplaceholder.typicode.com/posts").
		then().
			statusCode(200).
			log().body();
	}
}
