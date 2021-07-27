import java.util.*;

public class SuiteACRoom extends HotelRoom {
	private  int ratePerSqFeet;

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

	public SuiteACRoom() {
		super();
		setRatePerSqFeet(15);
		
	}
	public SuiteACRoom(String hotelName, Integer numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		setRatePerSqFeet(15);
		
	}
	

}
