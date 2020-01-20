package com.lti.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private int rollNumber;
	private String studentName;
	private double studentScore;
	private Address address; // = new Address();

	public Student() {
		super();
		System.out.println("Meri shaktiyon ka galat istemaal hua hai maa");
	}

	public Student(int rollNumber, String studentName, double studentScore, Address address) {
		System.out.println("Kabhi kabhi lagta hai apun hi bhagwan hai");
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentScore = studentScore;
		this.address = address;
	}

	// public Student(Address address){
	// this.address = address;
	//
	// }

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		System.out.println("1");
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("2");
		this.studentName = studentName;
	}

	public double getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(double studentScore) {
		System.out.println("3");
		this.studentScore = studentScore;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("4");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// System.out.println("Student Bean is ready to use");

	}

	@Override
	public void destroy() throws Exception {
		// System.out.println("Student Bean is about to delete");

	}

	public void init() {
		System.out.println("Custom Init");
	}

	public void delete() {
		System.out.println("Custom Delete");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("@Postconstruct method");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("@Predestroy method");
	}
}
