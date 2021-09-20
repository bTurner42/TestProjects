import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class HappyPath_DELETE {
	
	//Delete a post.
	@Test
	public void deletePost() {
		
		//Validate DELETE request is successful - return 200 (since response includes entity). 
		when().
			delete("https://jsonplaceholder.typicode.com/posts/{postId}", 1).
		then().
			statusCode(200).
			log().all();
	}
}
