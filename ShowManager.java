package task2;

import java.util.List;

public interface ShowManager

{
	public List<Show> populate(String fileName);
	
    public void bookShow(List<Show> showList, String showName, String show_time, int noOfSeats)
    		throws SeatsNotAvailableException, UnknownSHowException, InvalidSeatNumberException;;
    
}