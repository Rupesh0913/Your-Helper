package com.masai.service;

import java.util.Map;
import java.util.Map.Entry;

import com.masai.entities.Criminal;

import com.masai.exceptions.CriminalException;




public class CriminalServiceImpl implements CriminalService  {
	public String addCriminal(Criminal crmnl, Map<Integer, Criminal> criminal) {
		criminal.put(crmnl.getCriminal_id(), crmnl);
		return "Criminal Added";
	}
	
	
	public void viewAllCriminal(Map<Integer, Criminal> criminal) throws CriminalException {
		// TODO Auto-generated method stub
		if (criminal != null && criminal.size() > 0) {
			for (Map.Entry<Integer, Criminal> me : criminal.entrySet()) {
				System.out.println(me.getValue());
			}

		} else {
			throw new CriminalException("Criminal List is empty");
		}
	}
	
	public void deleteCriminal(int id, Map<Integer, Criminal> criminal) throws CriminalException {

		// System.out.println(products);
		if (criminal != null && criminal.size() > 0) {

			if (criminal.containsKey(id)) {
				criminal.remove(id);
				System.out.println("product deleted successfully");

			} else {
				throw new CriminalException("Criminal not found");
			}

		} else {
			throw new CriminalException("Criminal list is empty");
		}
	}
	public String updateRecord(int id,Criminal crmnl,Map<Integer, Criminal> criminal)throws CriminalException
	{
		if (criminal != null && criminal.size() > 0) {

			if (criminal.containsKey(id)) {
				criminal.put(id, crmnl);
				return "Criminal Record has successfully updated";
			} else {
				throw new  CriminalException("Criminal not found");
			}

		} else {
			throw new  CriminalException("Criminal list is empty");
		}
	}
}
