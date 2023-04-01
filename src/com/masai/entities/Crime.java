package com.masai.entities;

import java.io.Serializable;

public class Crime implements Serializable{
	 private String date;
	    private String crime_id;
	    private String type;
	    private String location;
	    private String description;
	    private String nameOfVictim;
	    
	    public Crime(String date, String crime_id, String type, String location, String details,String nameOfVictim) {
	        this.date = date;
	        this.crime_id = crime_id;
	        this.type = type;
	        this.location = location;
	        this.description = details;
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
	    
	    public String getCrime_id() {
			return crime_id;
		}

		public String getType() {
	        return type;
	    }
	    
	    public String getLocation() {
	        return location;
	    }
	    
	    public String getdescription() {
	        return description;
	    }
	    
	    public String toString() {
	        return date + " " + crime_id + " " + type + " " + location + " " + description;
	    }
}
