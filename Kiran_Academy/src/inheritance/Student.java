package inheritance;

import java.util.Scanner;

public class Student extends Person {
	
	Scanner sc = new Scanner(System.in);
	
	private float mathMark , engMark , sciMark , hisMark , phyMark;
	
	
	//getters
	public void getMathMark(float math) {
		mathMark = math;
	}
	
	public void getEngMark(float english) {
		engMark = english;
	}
	
	public void getSciMark(float science) {
		sciMark = science;
	}
	
	public void getHisMark(float history) {
		hisMark = history;
	}
	public void getPhyMark(float physics) {
		phyMark = physics;
	}
	
	//setters
	public float setMathMark() {
		return mathMark;
	}
	
	public float setEngMark() {
		return engMark;
	}
	
	public float setSciMark() {
		return sciMark;
	}
	
	public float setHisMark() {
		return hisMark;
	}
	
	public float setPhyMark() {
		return phyMark;
	}
	
	public void acceptStudentData(float mathMark , float engMark , float sciMark , float hisMark , float phyMark) {
		System.out.println("Enter Math Marks : ");
		getMathMark (sc.nextFloat());
		System.out.println("Enter English Marks : ");
		getEngMark(sc.nextFloat());
		System.out.println("Enter Science Marks : ");
		getSciMark(sc.nextFloat());
		System.out.println("Enter History Marks : ");
		getHisMark(sc.nextFloat());
		System.out.println("Enter Physics Marks : ");
		getPhyMark(sc.nextFloat());
	}
	
	public void displayStudentData() {
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("Students Mark Details");
		System.out.println("Student Math Mark : " + setMathMark());
		System.out.println("Student English Mark : " + setEngMark());
		System.out.println("Student Science Mark : " + setSciMark());
		System.out.println("Student History Mark : " + setHisMark());
		System.out.println("Student Physics Mark : " + setPhyMark());
	}
	
	public void getTotalMarks() {
		float sum ;
		sum = mathMark + engMark + sciMark + hisMark + phyMark;
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Total Marks : " + sum);
	}
	
	//constructor
	Student(){
		acceptData(setName(), setAge(), setMobile());
		acceptStudentData(mathMark ,engMark, sciMark , hisMark , phyMark );
		displayData();
		displayStudentData();
		getTotalMarks();
	}
	
}
