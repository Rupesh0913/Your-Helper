package com.masai.service;

import java.util.Map;
import java.util.Map.Entry;

import com.masai.entities.Criminal;
import com.masai.exceptions.CriminalException;


public class CriminalServiceImpl  {
	public static String addCriminal(Criminal crmnl, Map<Integer, Criminal> criminal) {
		criminal.put(crmnl.getCriminal_id(), crmnl);
		return "Criminal Added";
	}
	
	
	public void viewAllCriminals(Map<Integer, Criminal> criminal) throws CriminalException {
		// TODO Auto-generated method stub
		if (criminal != null && criminal.size() > 0) {
			for (Entry<Integer, Criminal> me : criminal.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new CriminalException("Product List is empty");
		}
	}
}
