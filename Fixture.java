package fixtures;

public class Fixture {
	private Room livingroom;
	private Room bedroom;
	private Room guestroom;
	private Room diningroom;
	private Room kitchen;
	private Room office;
	private Room patio;
	
	public Fixture() {
		this.livingroom = new Room("You have entered the livingroom. ");
		livingroom.setSouth(office);
		
		this.bedroom = new Room("You have entered the master bedroom. ");
		bedroom.setNorth(guestroom); bedroom.setEast(patio);
		
		this.guestroom = new Room("You are in the guestroom. ");
		guestroom.setSouth(bedroom); guestroom.setEast(office);
		
		this.diningroom = new Room("You are in the Dining Room. ");
		diningroom.setNorth(kitchen); diningroom.setWest(office);
		
		this.kitchen = new Room("You are in the Kitchen. ");
		kitchen.setSouth(diningroom); kitchen.setWest(office);
		
		this.office = new Room("You have entered the main office. ");
		office.setNorth(livingroom); office.setSouth(patio); office.setEast(kitchen); office.setWest(guestroom);
		
		this.patio = new Room("You are on the patio. ");
		patio.setNorth(office); patio.setEast(diningroom); patio.setWest(bedroom);
	}

	public Room getRoom() {
		// TODO Auto-generated method stub
		return null;
	}
}

