package nas.lab.samples;

/**
*	This is a sample class prepared for the interview.
*/

import java.util.ArrayList;


class Customer{
	private String firstName;
	private int age;
	private String country;
	private ArrayList<String> interests = new ArrayList<String>();
	
	Customer(){
	}
	
	Customer(String firstName, int age, String country, ArrayList<String> interests){
		this.firstName = firstName;
		this.age = age;
		this.country = country;
		this.interests = interests;
	}
	
	public String getFirstName(){
		return firstName;
	}	
	
	public int getAge(){
		return age;
	}
	
	public ArrayList<String> getInterests(){
		return interests;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setAge(int age){
		this.age = age;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public void setInterests(ArrayList<String> interests){
		this.interests = interests;
	}
	
}
