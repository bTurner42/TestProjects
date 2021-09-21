import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class HappyPath_DELETE extends TestDataSets {
	
	
	//Delete a post.
	@Test(dataProvider = "PostIdData")
	public void deletePost(int postId) {
		
		//Validate DELETE request is successful - return 200 (since response includes entity). 
		when().
			delete("https://jsonplaceholder.typicode.com/posts/{postId}", postId).
		then().
			statusCode(200).
			log().all();
	}
}
