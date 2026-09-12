package OOP;

public class StudentAktionen {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "Hasan";
		System.out.println(student1.name);      // Hasan

		Student student2 = new Student();
		student2.setNachname("Kalem");
		System.out.println(student2.getNachname());      // Kalem
	}
}
