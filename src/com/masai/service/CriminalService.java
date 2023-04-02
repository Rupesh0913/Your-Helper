package com.masai.service;

import java.util.Map;

import com.masai.entities.Criminal;
import com.masai.exceptions.CriminalException;

public interface CriminalService {
	public String addCriminal(Criminal crmnl, Map<Integer, Criminal> criminal) ;
	
	public void viewAllCriminal(Map<Integer, Criminal> criminal) throws CriminalException;
	
	public void deleteCriminal(int id, Map<Integer, Criminal> criminal) throws CriminalException;
	
	public String updateRecord(int id,Criminal crmnl,Map<Integer, Criminal> criminal)throws CriminalException;
}
