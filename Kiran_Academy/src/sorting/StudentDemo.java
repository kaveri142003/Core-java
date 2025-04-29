package sorting;


public class StudentDemo {
	public static void main(String[] args) {
		
		Student ss[] = new Student[3];
		
		Student s1 = new Student();
		
		s1.acceptData(ss);
		s1.displayData(ss);
//		s1.enterStudentInfo();
//		s1.showStudentInfo();
		Student.sortData(ss);
		System.out.println();
		System.out.println("Sorted Data");
		s1.displayData(ss);
	}
}
