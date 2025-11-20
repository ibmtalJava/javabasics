package entities;

public class StudentLesson {
	private Student student;
	private Lesson lesson;
	private int grade;
	private double not1;
	private double not2;
	private boolean status;
	public StudentLesson() {
		super();
	}
	public StudentLesson(Student student, Lesson lesson, int grade, double not1, double not2) {
		super();
		this.student = student;
		this.lesson = lesson;
		this.grade = grade;
		this.not1 = not1;
		this.not2 = not2;
		this.checkStatus();
	}
	public StudentLesson(Student student, Lesson lesson, int grade, double not1, double not2, boolean status) {
		super();
		this.student = student;
		this.lesson = lesson;
		this.grade = grade;
		this.not1 = not1;
		this.not2 = not2;
		this.status = status;
		this.checkStatus();
	}
	public void checkStatus() {
		double ort=(this.not1+this.not2)/2;
		if(ort<50) this.status=false; else this.status=true;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Lesson getLesson() {
		return lesson;
	}
	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getNot1() {
		return not1;
	}
	public void setNot1(double not1) {
		this.not1 = not1;
		this.checkStatus();
	}
	public double getNot2() {
		return not2;
	}
	public void setNot2(double not2) {
		this.not2 = not2;
		this.checkStatus();
	}
	public boolean isStatus() {
		return status;
	}

	
}
