package entities;

public class House {
	private String name;
	private double rating;
	private boolean seaView;
	private boolean kitchen;
	private boolean wifi;
	private Owner homeOwner;
	public House() {
		super();
	}
	public House(String name, double rating, boolean seaView, boolean kitchen, boolean wifi, Owner homeOwner) {
		super();
		this.name = name;
		this.rating = rating;
		this.seaView = seaView;
		this.kitchen = kitchen;
		this.wifi = wifi;
		this.homeOwner = homeOwner;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isSeaView() {
		return seaView;
	}
	public void setSeaView(boolean seaView) {
		this.seaView = seaView;
	}
	public boolean isKitchen() {
		return kitchen;
	}
	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}
	public boolean isWifi() {
		return wifi;
	}
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	public Owner getHomeOwner() {
		return homeOwner;
	}
	public void setHomeOwner(Owner homeOwner) {
		this.homeOwner = homeOwner;
	}
	
}
