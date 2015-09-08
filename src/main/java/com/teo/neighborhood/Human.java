package com.teo.neighborhood;

import java.util.ArrayList;
import java.util.EnumMap;

import com.teo.neighborhoodInterfaces.Humanable;

public abstract class  Human implements Humanable {//O(1)
	private int age = 0;
	private String name = null;
	private ArrayList<Language> language;
	

	/**
	 * @param age
	 * @param name
	 * @param language
	 */
	public Human(int age, String name, ArrayList<Language> language) {//O(1)

		this.age = age;
		this.name = name;
		this.language = language;
		

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.teo.neighborhoodInterfaces.Humanable#getAge()
	 */
	public int getAge() {//O(1)
		// TODO Auto-generated method stub
		return this.age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.teo.neighborhoodInterfaces.Humanable#getName()
	 */
	public String getName() {//O(1)
		// TODO Auto-generated method stub
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.teo.neighborhoodInterfaces.Humanable#getLanguageSpeakers(com.teo.
	 * neighborhood.Language)
	 */


	public ArrayList<Language> getLanguages() {//O(1)
		return this.language;
	}
	
	public void introduce(){
		System.out.print("Hello, my name is " + this.name + ". I am " + this.age + " years old and I speak ");
		// TODO this particular instance's languages have to be displayed to the console
	}


	// TEST POINT HERE

}
