package cn.crj.java.beanutils;

import java.util.Date;

//狭义JavaBean
public class Student {

	private String name;
	
	private Date birthday;
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Date getBirthday() {
		return birthday;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public Student(){}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
