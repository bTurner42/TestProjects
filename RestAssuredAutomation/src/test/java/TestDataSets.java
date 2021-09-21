import org.testng.annotations.DataProvider;

// Define test data sets to use for data driven testing.
public class TestDataSets {
	
	//Returns a two dimensional object of post data.
	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost(){	
		return new Object[][] {
			{"Deadman's Chest", "Yo ho, yo ho, a pirate's life for me!", 11},
			{"Davey Jones Locker", "We're sailing the seven seas", 12},
			{"Curse of the Black Pearl", "The ship needs a captain", 13}
		};
		
	}
	
	
	//Returns a two dimensional object of post comment data.
	@DataProvider(name = "DataForCreateComment")
	public Object[][] dataForCreateComment()
	{
		return new Object[][] {
			{"Brittany Turner", "brittany.turner@fisglobal.com", "This was the best movie ever"},
			{"Brittany Jones", "brittany.jones@gmail.com", "This was an ok movie"},
			{"Elizabeth Swan", "elizabethswan@hotmail.com", "This was a stellar movie"}
		};
	}
	
	//Returns a two dimensional object of photo data.
	@DataProvider(name = "DataForPhotoAlbum")
	public Object[][] dataForPhotoAlbum()
	{
		return new Object[][] {
			{"Azetc Necklace", "https://via.placeholder.com/600/d32890", "https://via.placeholder.com/150/d32890"},
			{"Treasure Chest", "https://via.placeholder.com/400/d32891", "https://via.placeholder.com/160/d32891"},
			{"Heart of the Ocean", "https://via.placeholder.com/333/d32800", "https://via.placeholder.com/170/d32890"},
		};
	}
	
	//Returns a single dimensional object with titles.
	@DataProvider(name = "TitleData")
	public Object[] dataForTitle()
	{
		return new Object[] {
			"Stranger Things", "Mortal Kombat", "300", "Spawn"
		};
	}
		
	//Return a single dimensional object with postId data.
	@DataProvider(name = "PostIdData")
	public Object[] postId(){
		return new Object[] {
			1, 2, 10, 9
		};
	}
}
