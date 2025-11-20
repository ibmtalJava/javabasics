package schoolProject;

import java.util.ArrayList;

import entities.Lesson;
import entities.Student;
import entities.StudentLesson;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<SchoolClass> schoolClass = new ArrayList<SchoolClass>();
		ArrayList<Lesson> lessons=new ArrayList<Lesson>();
		Student ogr1 = new Student();
		students.add(ogr1);// student->0
		students.add(new Student("Ali", "Kalenderoðlu", 1045, true));// student->1

		ogr1.setName("Ali Eren");
		ogr1.setSurname("Özdemiroðlu");
		ogr1.setSchoolNumber(873);
		students.get(0).setGender(true);

		students.add(new Student());// student->2
		students.get(2).setName("Ömer Mert");
		students.get(2).setSurname("Veren");
		students.get(2).setSchoolNumber(920);
		students.get(2).setGender(true);
		students.get(0).print();
		students.get(2).print();
		SchoolClass snf1 = new SchoolClass();
		schoolClass.add(snf1);
		snf1.setName("A");
		snf1.setGrade(9);
		schoolClass.add(new SchoolClass("b", 10));
		schoolClass.add(new SchoolClass("c", 11));
		schoolClass.add(new SchoolClass("d", 12));
		
		lessons.add(new Lesson("Metematik"));
		lessons.add(new Lesson("Fizik"));
		lessons.add(new Lesson("Kimya"));
		lessons.add(new Lesson("Biyoloji"));
		lessons.add(new Lesson("Tarih"));
		lessons.add(new Lesson("Coðrafya"));
		lessons.add(new Lesson("Felsefe"));
		lessons.add(new Lesson("Din Kültürü"));
		lessons.add(new Lesson("Edebiyat"));
		lessons.add(new Lesson("Beden Eðitimi"));
		lessons.add(new Lesson("Yabancý Dil"));
		StudentLesson sl=new StudentLesson(students.get(2), lessons.get(2),10, 30, 50);
		sl.setNot1(80);
		sl.setNot2(10);
		System.out.println(sl.getStudent().getName()+" -> "+sl.getLesson().getName()
				+" = "+sl.isStatus());
		//studentLessons adýnda liste oluþtuyrun ve 5 tane kayýt ekleyin.
		//studentLessons lardan kalanlarý listeleyiniz

	}

}
