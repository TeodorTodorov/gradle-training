package com.teo.neighborhood;

import java.util.ArrayList;
import java.util.EnumMap;

public class Neighborhood { 
	HumanFactory fact; //O(1)
	private int ageSum = 0;//O(1)
	private int instanceCount = 0;//O(1)
	private ArrayList<Human> humansInNeighborhood;//O(1)
	private EnumMap<Language, ArrayList<Human>> speakers ;//O(1)

	public  Neighborhood() {//O(1)
		this.fact = new HumanFactory();
		humansInNeighborhood = new ArrayList<>();
		speakers = new EnumMap<Language, ArrayList<Human>>(
				Language.class);
		

	}



	public ArrayList<Human> getLanguageSpeakers(Language lang) { //O(1)
		return speakers.get(lang);

	}

	/**
	 * 
	 */
	private void putInLanguageCollection(Human hum) {
		for (Language objectl : hum.getLanguages()) {
			if (!speakers.containsKey(objectl)) {
				ArrayList<Human> arr = new ArrayList<Human>();
				arr.add(hum);
				speakers.put(objectl, arr);
			} else if (speakers.containsKey(objectl)) {
				ArrayList<Human> arr = speakers.get(objectl);
				if (!arr.contains(hum)) {
					arr.add(hum);
				}

			}

		}

	}

	public float getMiddleAge() {//O(1)
		// TODO Auto-generated method stub
		return (this.getAgeSum() / this.getInstanceCount());
	}

	public int getInstanceCount() {
		return instanceCount;
	}

	private void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}

	private void addToNeighborhood(Human hum) {
		humansInNeighborhood.add(hum);
	}

	public int getAgeSum() {
		return ageSum;
	}

	private void setAgeSum(int ageSum) {
		this.ageSum = ageSum;
	}

	public Human addHuman(int age, String name, ArrayList<Language> language) throws Exception {
		Human hum = (Human) fact.getHumanInstance(name, age, language);
		this.setAgeSum(this.getAgeSum() + age);
		this.setInstanceCount(this.getInstanceCount() + 1);
		putInLanguageCollection(hum);

		return hum;
		
	}

}
