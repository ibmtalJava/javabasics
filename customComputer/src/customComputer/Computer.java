package customComputer;

public class Computer {
	public String name;
	public double price;
	public String operatingSystem;
	public Mainboard mainboard;
	public Cpu cpu;
	public String brand;
	public Computer() {
		super();
	}
	public Computer(String name, double price, String operatingSystem, Mainboard mainboard, Cpu cpu) {
		super();
		this.name = name;
		this.price = price;
		this.operatingSystem = operatingSystem;
		this.mainboard = mainboard;
		this.cpu = cpu;
	}
	public Computer(String name, double price, String operatingSystem, Mainboard mainboard, Cpu cpu, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.operatingSystem = operatingSystem;
		this.mainboard = mainboard;
		this.cpu = cpu;
		this.brand = brand;
	}
	
	
}
