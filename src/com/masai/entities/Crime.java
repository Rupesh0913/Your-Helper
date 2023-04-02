package com.masai.entities;

import java.io.Serializable;

public class Crime implements Serializable{
	 private String date;
	    private int crime_id;
	    private String type;
	    private String location;

	    private String nameOfVictim;
	    
	    public Crime(int crime_id,String date, String type, String location,String nameOfVictim) {
	        this.date = date;
	        this.crime_id = crime_id;
	        this.type = type;
	        this.location = location;
	       
	        this.nameOfVictim=nameOfVictim;
	    }
	    
	    public String getNameOfVictim() {
			return nameOfVictim;
		}

		public void setNameOfVictim(String nameOfVictim) {
			this.nameOfVictim = nameOfVictim;
		}

		public String getDate() {
	        return date;
	    }
	    
	    public int getCrime_id() {
			return crime_id;
		}

		public String getType() {
	        return type;
	    }
	    
	    public String getLocation() {
	        return location;
	    }
	    
	   
	    
	    public String toString() {
	        return date + " " + crime_id + " " + type + " " + location + " " ;
	    }
}
