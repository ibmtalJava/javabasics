package carShop;

public class Main {

	public static void main(String[] args) {
		Car bmwBlue2023=new Car();
		bmwBlue2023.name="BMW 5.20 TDI 2023 Blue";
		bmwBlue2023.brand="BMW";
		bmwBlue2023.model=2023;
		bmwBlue2023.color="Metalik Mavi";
		bmwBlue2023.automaticGear=true;
		bmwBlue2023.personCount=4;
		bmwBlue2023.price=8550;
		Car bmwWhite2025=new Car();
		bmwWhite2025.name="BMW 5.20 TDI 2025";
		bmwWhite2025.brand="BMW";
		bmwWhite2025.model=2025;
		bmwWhite2025.color="Beyaz";
		bmwWhite2025.automaticGear=true;
		bmwWhite2025.personCount=5;
		bmwWhite2025.price=11550;
		
		Car car;
		car=bmwBlue2023;
		System.out.println(car.name);
		System.out.println("Marka :"+car.brand);
		System.out.println("   ------------------------  ");
		car=bmwWhite2025;
		System.out.println(car.name);
		System.out.println("Marka :"+car.brand);
		//Customer 
		Customer mustafaKus=new Customer();
		mustafaKus.name="Mustafa";
		mustafaKus.surname="KUÞ";
		mustafaKus.phone="0547 254 65 35";
		mustafaKus.age=49;
		//Saller satýcý
		Saller mithat=new Saller();
		mithat.name="Mithat";
		mithat.surname="Çobanoðlu";
		mithat.phone="0547 245 14 56";
		mithat.gender=true;
		
		Rent rent1=new Rent();
		rent1.car=bmwBlue2023;
		rent1.customer=mustafaKus;
		rent1.saller=mithat;
		rent1.rentStart="26.09.2025";
		rent1.rentEnd="29.09.2025";
		System.out.println("------ 1. Araç Kiralama ---------");
		System.out.println("Araç :"+rent1.car.name);
		System.out.println("Müþteri :"+rent1.customer.name+" "+rent1.customer.surname);
		System.out.println("Kiralayan :"+rent1.saller.name+" "+rent1.saller.surname);
		System.out.println("Kiralýk Tarihleri"+rent1.rentStart+" - "+ rent1.rentEnd);
		/*
		 * hotelRezervation adýnda proje oluþturun
		 * Room adýnda odalar için class oluþturun
		 * Customer adýnda müþteri bilgileri için class oluþturun
		 * Rezervation adýnda rezervasyonlar için class oluþturun
		 * her class için 3 er adet kayýt oluþturun
		 * */
	}

}
