package entities;

public class Medicane {
	private String name;
	private double grammage;
	private double quan;
	private boolean forKids;
	public Medicane() {
		super();
	}
	public Medicane(String name, double grammage, double quan, boolean forKids) {
		super();
		this.name = name;
		this.grammage = grammage;
		this.quan = quan;
		this.forKids = forKids;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrammage() {
		return grammage;
	}
	public void setGrammage(double grammage) {
		this.grammage = grammage;
	}
	public double getQuan() {
		return quan;
	}
	public void setQuan(double quan) {
		this.quan = quan;
	}
	public boolean isForKids() {
		return forKids;
	}
	public void setForKids(boolean forKids) {
		this.forKids = forKids;
	}
	
}
