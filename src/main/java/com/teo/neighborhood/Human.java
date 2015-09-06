package com.teo.neighborhood;

import java.util.ArrayList;
import java.util.EnumMap;

import com.teo.neighborhoodInterfaces.Humanable;

public abstract class  Human implements Humanable {
	private int age = 0;
	private String name = null;
	private ArrayList<Language> language;
	

	/**
	 * @param age
	 * @param name
	 * @param language
	 */
	public Human(int age, String name, ArrayList<Language> language) {

		this.age = age;
		this.name = name;
		this.language = language;
		

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.teo.neighborhoodInterfaces.Humanable#getAge()
	 */
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.teo.neighborhoodInterfaces.Humanable#getName()
	 */
	public String getName() {
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


	public ArrayList<Language> getLanguages() {
		return this.language;
	}


	// TEST POINT HERE

}
