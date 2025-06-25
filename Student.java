package com.StudentManagmentSystem;

public class Student {

	private int Stdid;
	private String StdName;
	private int Age;
	private String Branch;
	private int  Marks;
	private int POY;

	public Student(int Stdid, String StdName, int Age, String Branch, int Marks, int POY) {
		this.Stdid = Stdid;
		this.StdName = StdName;
		this.Age = Age;
		this.Branch = Branch;
		this.Marks = Marks;
		this.POY = POY;
	}

	public Student() {

	}

	public int getStdid() {
		return Stdid;
	}

	public void setStdid(int stdid) {
		if (stdid > 0) {
			this.Stdid = stdid;
		} else {
			System.out.println("Enter the valid Student ID:");
		}
	}

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String StdName) {
		if (StdName != null && !StdName.trim().isEmpty()) {
			this.StdName = StdName;
		} else {
			System.out.println("Enter a valid Student Name (cannot be empty).");
		}
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		if (age > 0 && age <= 100) {
			this.Age = age;
		} else {
			System.out.println("Enter a valid Age (between 1 and 100).");
		}
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int Marks) {
	    if (Marks >= 0 && Marks <= 100) { // Optional validation
	        this.Marks = Marks;
	    } else {
	        System.out.println("Enter valid marks (0 to 100)");
	    }
	}
	public int getPOY() {
		return POY;
	}

	public void setPOY(int pOY) {
		POY = pOY;
	}

	@Override
	public String toString() {
		return "Student [ID=" + Stdid + ", Name=" + StdName + ", Age=" + Age + ", Branch=" + Branch + ", Marks=" + Marks
				+ ", POY=" + POY + "]";
	}

}
