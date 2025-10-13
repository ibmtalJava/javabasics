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
		Cpu cpu1=new Cpu("Ýntel I9",4500000, 8);
		Cpu cpu2=new Cpu("Amd Rayzen 5", 58000, 8);
		
	}

}
