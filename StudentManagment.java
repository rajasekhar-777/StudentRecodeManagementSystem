package com.StudentManagmentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagment {

	private ArrayList<Student> students = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	static boolean status = true;

	public void addStudent(Student student) {
		System.out.println("Enter the StudentId:");
		int Stdid = sc.nextInt();
		student.setStdid(Stdid);
		System.out.println("Enter the Student Name:");
		String stdName = sc.next();
		student.setStdName(stdName);
		System.out.println("Enter the Student Age:");
		int Age = sc.nextInt();
		student.setAge(Age);
		System.out.println("Enter the student Branch:");
		String Branch = sc.next();
		student.setBranch(Branch);
		System.out.println("Enter the Student Marks:");
		int marks = sc.nextInt();
		student.setMarks(marks);
		System.out.println("Enter the passedoutyear:");
		int POY = sc.nextInt();
		student.setPOY(POY);
		students.add(student);
		System.out.println("Student added succesfully");
	}

	public void getStudent() {
		if (students.isEmpty()) {
			System.out.println("No student found");
		} else {
			for (Student student : students) {
				System.out.println(student);
			}
		}
	}
	
	   public void  deleteStudent () {
		   if(students.isEmpty()) {
			   System.out.println("No student found ");
		   }else {
			   students.clear();
			   System.out.println("Student Data Deleted succesfully!");
		   }
	   }
	   
	   public void updateStudent() {
		    System.out.println("Enter the Student ID to update:");
		    int id = sc.nextInt();
		    boolean found = false;

		    for (Student student : students) {
		        if (student.getStdid() == id) {
		            found = true;

		            System.out.println("Existing Student: " + student);

		            System.out.println("Enter new Student Name:");
		            String name = sc.next();
		            student.setStdName(name);

		            System.out.println("Enter new Age:");
		            int age = sc.nextInt();
		            student.setAge(age);

		            System.out.println("Enter new Branch:");
		            String branch = sc.next();
		            student.setBranch(branch);

		            System.out.println("Enter new Marks:");
		            int marks = sc.nextInt();
		            student.setMarks(marks);

		            System.out.println("Enter new Passed Out Year:");
		            int poy = sc.nextInt();
		            student.setPOY(poy);

		            System.out.println("Student updated successfully!");
		            break;
		        }
		    }

		    if (!found) {
		        System.out.println("Student with ID " + id + " not found.");
		    }
		}


	public void flow(Student student) {
		int choice;
		while (status) {
			System.out.println("1. Add Student");
			System.out.println("2. View Student");
			System.out.println("3. Delete Student");
			System.out.println("4. update Student");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudent(student);
				break;

			case 2:
				getStudent();
				break;
			case 3:
				deleteStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				System.out.println("Exited succesfully!");
				break;
			
			default:
				System.out.println("please Enter the valid choice !");
			}
			System.out.println("Do you want continue the service!? Yes/No");

			String s = sc.next();
			if (!s.equalsIgnoreCase("Yes")) {
				status = false;
				break;
			}
		}

	}

	public static void main(String[] args) {
		StudentManagment s = new StudentManagment();
		Student student = new Student();
		s.flow(student);

	}

}
