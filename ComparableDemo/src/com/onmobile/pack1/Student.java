package com.onmobile.pack1;

import java.util.Random;

public class Student implements Comparable<Student>{
	
	private int studentId;
	private String name;
	private double marks;
	private static int count =0;
	

	public Student(String name, double marks) {
		super();
		this.studentId = randomNo();
		this.name = name;
		this.marks = marks;
	}
	public static int randomNo(){
		Random rand = new Random();
		count = rand.nextInt(1000)+1000;
		return count;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	@Override
	public int compareTo(Student o) {
		double res = getMarks()-o.getMarks();
		if(res==0)
		return 0;
		else
			if (res>0){
				return 1;
			}
			else 
				return -1;
		}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	
	
	

}
