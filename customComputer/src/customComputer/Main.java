package customComputer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainboard anakart1=new Mainboard();
		anakart1.name="MSI PRO B760M-P DDR4 Intel B760 DDR4 Micro ATX Anakart";
		anakart1.brand="MSI";
		anakart1.maxRam=128;
		anakart1.price=5423;
		Mainboard anakart2=new Mainboard();
		anakart2.name="MSI PRO B760M-P DDR4 Intel B760 DDR4 Micro ATX Anakart";
		anakart2.brand="MSI";
		anakart2.maxRam=64;
		anakart2.price=5423;
		Mainboard anakart3=new Mainboard("MSI MB Pro A620M-E AM5 DDR5 6000MHZ(OC) HDMI VGA 1X M.2 USB3.2 Gigabit LAN Matx Anakart","MSI",256,3649,false,8);
		anakart1.print();
		anakart2.print();
		anakart3.print();
		Cpu cpu1=new Cpu("İntel I9",4500000, 8);
		Cpu cpu2=new Cpu("Amd Rayzen 5", 58000, 8);
		
		Computer bilg=new Computer();
		bilg.name="Apple 16\" MacBook Pro: Apple M4 Max chip with 16‑core CPU and 40‑core GPU, 48GB, 1TB SSD - Gümüş";
		bilg.price=54567.48;
		bilg.operatingSystem="Windows 11 Pro";
		bilg.mainboard=anakart1;
		bilg.cpu=cpu1;
		System.out.println(bilg.name);
		bilg.mainboard.print();
		
	}

}
