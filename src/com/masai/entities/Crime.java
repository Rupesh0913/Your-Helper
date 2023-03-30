package com.masai.entities;

public class Crime {
	 private String date;
	    private String crime_id;
	    private String type;
	    private String location;
	    private String description;
	    
	    public Crime(String date, String crime_id, String type, String location, String details) {
	        this.date = date;
	        this.crime_id = crime_id;
	        this.type = type;
	        this.location = location;
	        this.description = details;
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
