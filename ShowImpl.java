package task2;
import java.util.List;

public class ShowImpl implements BookMyShow {

	
	@Override
	public void displayAllShows(List<Show> shows) {
		shows.forEach(System.out::println);

	}
}