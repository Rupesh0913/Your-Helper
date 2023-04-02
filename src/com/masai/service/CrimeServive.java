package com.masai.service;

import java.util.Map;

import com.masai.entities.Crime;
import com.masai.exceptions.crimeException;


public interface CrimeServive {
	public String addCrime(Crime crim, Map<Integer, Crime> crime);
	
	public void viewAllCrimes(Map<Integer, Crime> crime) throws crimeException;

	public void deleteCrime(int id, Map<Integer, Crime> crime) throws crimeException;

	public String updatecrime(int id, Crime crim, Map<Integer, Crime> crime) throws crimeException;

}
