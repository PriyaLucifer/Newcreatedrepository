package org.college;

public class College {

	private void clgName() {
		System.out.println("Bharath university");
	}
	private void clgCode() {
		System.out.println("College Code: BIST0017");
	}
	private void clgRank() {
		System.out.println("College Rank: A++");
	}
	

	private void studentName() {
		System.out.println("name is jeevi");
	}
	private void studentId() {
		System.out.println("Id is 4657");
	}
	private void studentPhoneno() {
		System.out.println("phone is 87655333");
	}
		
	
	private void stuDep() {
	System.out.println("Student dept id: computer science engineering");
		
	}
	
	private void stuGrade() {
		System.out.println("Student grade is: A");
		
	}
	private void name() {
System.out.println("jeevi");
	}
	
	

	public static void main(String[] args) {
		College c=new College();
		c.clgName();
		c.clgCode();
		c.clgRank();
		Student s=new Student();
		s.stuName();
		s.stuId();
		s.stuDept();

	}

}
