package entities;

public class Student {
	private String name;
	private String surname;
	private int schoolNumber;
	private boolean gender;
	public Student() {
		super();
	}
	public Student(String name, String surname, int schoolNumber, boolean gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.schoolNumber = schoolNumber;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void print() {
		System.out.println(this.getName()+"    "+this.getSurname()+"  "+this.getSchoolNumber()+"   "+this.isGender());
	}
	
}
