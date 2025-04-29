package arrayList;

public class demoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student a = new Student("Rushikesh" , 22);  //inserting data using parameterized constructor
		Student b = new Student("Nishchal" , 23);   //inserting data using parameterized constructor
		Student c = new Student("Kaveri" , 24);     //inserting data using parameterized constructor
		Student d = new Student("Manasi" , 25);     //inserting data using parameterized constructor
		Student e = new Student("Trupti" , 26);     //inserting data using parameterized constructor

		Student f = new Student(); //inserting data using non-parameterized constructor

		Student.printArrayList(); 	//printing array-list	
		
		
	}

}
