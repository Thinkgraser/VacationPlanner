package dmacc.beans;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Apr 11, 2022
 */
public class Hotel {

	private long id;
	private String hotelName;
	private int roomNumber;
	private boolean occupied;
	private Address hotelAddress;
	
	
	public Hotel(String hotelName, int roomNumber, boolean occupied, Address hotelAddress) {
		super();
		this.hotelName = hotelName;
		this.roomNumber = roomNumber;
		this.occupied = occupied;
		this.hotelAddress = hotelAddress;
	}
	
	public Hotel(int roomNumber, boolean occupied) {
		super();
		this.roomNumber = roomNumber;
		this.occupied = occupied;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}
	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the occupied
	 */
	public boolean isOccupied() {
		return occupied;
	}
	/**
	 * @param occupied the occupied to set
	 */
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Address getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(Address hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	
	
}
