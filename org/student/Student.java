package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("**studentName**");
	}

	public void studentDept() {
		System.out.println("***StudentDept***");
	}

	public void studentId() {
		System.out.println("***StudentId***");
	}

	public static void main(String[] args) {

		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
}
