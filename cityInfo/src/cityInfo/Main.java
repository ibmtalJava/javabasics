package cityInfo;



public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ankaraName="ANKARA";
		int ankaraNufus=5787450;
		boolean ankaraBuyukSehir=true;
		double ankaraKisiBasiGelir=14200.5;
		
		String istanbulName="Ýstanbul";
		int istanbulNufus=22457846;
		boolean istanbulBuyukSehir=true;
		double istanbulKisiBasiGelir=18457.78;
		City istanbul=new City();
		istanbul.name="Ýstanbul";
		istanbul.nufus=22457846;
		istanbul.gelir=14200.5;
		istanbul.buyuksehir=true;
		City ankara=new City();
		ankara.name="ANKARA";
		ankara.nufus=5787450;
		ankara.gelir=14200.5;
		ankara.buyuksehir=true;
		
		City city=ankara;
		
		System.out.println("Þehir :"+city.name);
		System.out.println("Nüfus :"+city.nufus);
		System.out.println("Büyükþehir :"+(city.buyuksehir?"Evet":"Hayýr"));
		System.out.println("Kiþi baþý gelir :"+city.gelir);
		city=istanbul;
		System.out.println("Þehir :"+city.name);
		System.out.println("Nüfus :"+city.nufus);
		System.out.println("Büyükþehir :"+(city.buyuksehir?"Evet":"Hayýr"));
		System.out.println("Kiþi baþý gelir :"+city.gelir);
		//studentInfo adýnda proje oluþturun ve gruptaki öðrenci bilgilerini 
		//city gibi yazdýrýn. Student class'ý oluþturun
	}

}
