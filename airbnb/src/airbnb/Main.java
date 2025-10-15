package airbnb;

import entities.Customer;
import entities.House;
import entities.Owner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Owner alieren=new Owner();
		alieren.setName("Ali Eren");
		alieren.setSurname("Özdemiroðlu");
		alieren.setEmail("alierenozdemir@gmail.com");
		alieren.setPhone("0547 654 52 54");
		alieren.setRating(4.3);
		System.out.println(alieren.getName());
		Customer bozkurt=new Customer("Bozkurt Mert", "Mutluer", "0532 125 14 47", "bozkurt14@gmail.com");
		House sultanAhmetMiniStudio=new House();
		sultanAhmetMiniStudio.setName("Sultanahmet ,Tramvay 10 dakika. Mini studio #01");
		sultanAhmetMiniStudio.setRating(4.8);
		sultanAhmetMiniStudio.setSeaView(true);
		sultanAhmetMiniStudio.setWifi(false);
		sultanAhmetMiniStudio.setKitchen(true);
		sultanAhmetMiniStudio.setHomeOwner(alieren);
		
		
		
	}

}
