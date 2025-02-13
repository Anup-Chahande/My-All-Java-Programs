package com.tka;

public class Player {
	Player() {
	}

	private String name;
	private int jno;
	private int age;
	private String country;
	private String profile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJno() {
		return jno;
	}

	public void setJno(int jno) {
		this.jno = jno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Player(String name, int jno, int age, String country, String profile) {
		super();
		this.name = name;
		this.jno = jno;
		this.age = age;
		this.country = country;
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jno=" + jno + ", age=" + age + ", country=" + country + ", profile="
				+ profile + "]";
	}

}
