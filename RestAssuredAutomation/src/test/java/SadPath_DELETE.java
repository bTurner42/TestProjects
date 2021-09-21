import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class SadPath_DELETE extends TestDataSets {
	//Response status code does not return 204.
	@Test(dataProvider = "PostIdData")
	public void deletePostResponse_isNot204(int postId) {
		
		//Validate status code does not return 204 but 200. 
		Response response = delete("https://jsonplaceholder.typicode.com/posts/{postId}", postId);
		int statusCode = response.getStatusCode();
		Assert.assertNotSame(statusCode, 204);
	}
	
	//Do not delete resource post collection.
	@Test
	public void deleteAllPosts() {
		
		//Validate that attempting to delete a collection of posts results in error (404).
		//Observation: Probably should return 405 (method not allowed) instead.
		when().
			delete("https://jsonplaceholder.typicode.com/posts/").
		then().
			assertThat().statusCode(404);
	}

}
