package entities;

import java.util.ArrayList;

public class Prescription {
	private int id;
	private ArrayList<Medicane> medicanes;
	public Prescription() {
		this.medicanes=new ArrayList<Medicane>();
	}
	public Prescription(int id) {
		this.medicanes=new ArrayList<Medicane>();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Medicane> getMedicanes() {
		return medicanes;
	}
	public void setMedicanes(ArrayList<Medicane> medicanes) {
		this.medicanes = medicanes;
	}
	

	
}
