package home.lsw.test;

import java.util.Scanner;

public class Person {
	private String name[] = new String[100];
	private static Gender gender;
	private String phone[] = new String[100];
	Scanner sc = new Scanner(System.in);

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
		
	}

	public String[] getPhone() {
		return phone;
	}

	public void setPhone(String[] phone) {
		this.phone = phone;
	}

	public static Gender getGender() {
		return gender;
	}

	public static void setGender(Gender gender) {
		Person.gender = gender;
	}

} // class end
