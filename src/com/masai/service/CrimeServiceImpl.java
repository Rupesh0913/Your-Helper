package com.masai.service;

import java.util.Map;

import com.masai.entities.Crime;

import com.masai.exceptions.crimeException;

public class CrimeServiceImpl implements CrimeServive{
	
	public String addCrime(Crime crim, Map<Integer, Crime> crime) {
		crime.put(crim.getCrime_id(), crim);
		return "Crime Added";
	}
	
	
	public void viewAllCrimes(Map<Integer, Crime> crime) throws crimeException {
		// TODO Auto-generated method stub
		if (crime != null && crime.size() > 0) {
			for (Map.Entry<Integer, Crime> me : crime.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new crimeException("Crime List is empty");
		}
	}
	
	public void deleteCrime(int id, Map<Integer, Crime> crime) throws crimeException {

		// System.out.println(products);
		if (crime != null && crime.size() > 0) {

			if (crime.containsKey(id)) {
				crime.remove(id);
				System.out.println("crime deleted successfully");

			} else {
				throw new crimeException("crime not found");
			}

		} else {
			throw new crimeException("crime list is empty");
		}
	}
	public String updatecrime(int id,Crime crim,Map<Integer, Crime> crime)throws crimeException
	{
		if (crime != null && crime.size() > 0) {

			if (crime.containsKey(id)) {
				crime.put(id, crim);
				return "Crime Record has successfully updated";
			} else {
				throw new  crimeException("Crime not found");
			}

		} else {
			throw new  crimeException("Crime list is empty");
		}
	}
	
}
