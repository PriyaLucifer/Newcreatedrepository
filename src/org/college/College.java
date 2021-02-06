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
