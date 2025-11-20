package listeler;

import java.util.ArrayList;

import entities.City;

public class Main {
	public static void main(String[] args) {
		ArrayList<City> city=new ArrayList<City>();
		city.add(new City("Adana",1000));
		city.add(new City("Adýyaman",2000));
		city.add(new City("Bolu",14000));
		city.add(new City("Ýstanbul",34000));
		city.add(new City("Çankýrý",18000));
		for(City c:city) {
			System.out.println(c.getName()+"("+c.getPostalCode()+")");
		}
		//Language adýnda entity oluþturun name="English" shortName="En"
		//Country name="Türkiye" shortName="tr" phoneCode="+90" capital=city.get(1)
	}

}
