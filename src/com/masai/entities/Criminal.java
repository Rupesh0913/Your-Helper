package com.masai.entities;

public class Criminal {
//	criminal_id, name, dob, gender, identifying_mark,
//	   first_arrest_date, arrested_from_ps_area.
	
	private String criminal_id;
	private String name;
	private String dob;
	private String gender;
	private String identifying_mark;
	private String first_arrest_data;
	private String arrested_from_ps_area;
	
	public Criminal(String criminal_id, String name, String dob, String gender, String identifying_mark,
			String first_arrest_data, String arrested_from_ps_area) {
		super();
		this.criminal_id = criminal_id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.identifying_mark = identifying_mark;
		this.first_arrest_data = first_arrest_data;
		this.arrested_from_ps_area = arrested_from_ps_area;
	}

	public String getCriminal_id() {
		return criminal_id;
	}

	public void setCriminal_id(String criminal_id) {
		this.criminal_id = criminal_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdentifying_mark() {
		return identifying_mark;
	}

	public void setIdentifying_mark(String identifying_mark) {
		this.identifying_mark = identifying_mark;
	}

	public String getFirst_arrest_data() {
		return first_arrest_data;
	}

	public void setFirst_arrest_data(String first_arrest_data) {
		this.first_arrest_data = first_arrest_data;
	}

	public String getArrested_from_ps_area() {
		return arrested_from_ps_area;
	}

	public void setArrested_from_ps_area(String arrested_from_ps_area) {
		this.arrested_from_ps_area = arrested_from_ps_area;
	}

	@Override
	public String toString() {
		return "Criminal [criminal_id=" + criminal_id + ", name=" + name + ", dob=" + dob + ", gender=" + gender
				+ ", identifying_mark=" + identifying_mark + ", first_arrest_data=" + first_arrest_data
				+ ", arrested_from_ps_area=" + arrested_from_ps_area + "]";
	}
	
	
	
}
