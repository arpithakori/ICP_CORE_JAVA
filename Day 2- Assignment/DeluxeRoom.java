import java.util.*;

public class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;
	
	public DeluxeRoom() {
		super();
		this.ratePerSqFeet = 10;
	}

	public DeluxeRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTV,Boolean hasWifi,int ratePerSqFeet) {
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		if(isHasWifi()) {
			return ratePerSqFeet+2;
		}
		else {
			return ratePerSqFeet;
		}
		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	
}
