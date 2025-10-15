package prescriptionSystem;

import java.util.ArrayList;

import entities.Medicane;
import entities.Prescription;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Medicane> medicanes= new ArrayList<Medicane>();
		medicanes.add(new Medicane("Parol", 0.020, 30, false));
		
		medicanes.add(new Medicane());
		medicanes.get(1).setName("Aferin");
		medicanes.get(1).setGrammage(0.01);
		medicanes.get(1).setQuan(20);
		medicanes.get(1).setForKids(true);
		
		medicanes.add(new Medicane("ibucold", 0.05,10 , false));
		
		Prescription musabRecete=new Prescription(1001);
		musabRecete.getMedicanes().add(medicanes.get(1));
		musabRecete.getMedicanes().add(medicanes.get(0));
		
		
	}

}
