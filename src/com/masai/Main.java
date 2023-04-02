package com.masai;
import java.util.Map;
import java.util.Scanner;

import com.masai.entities.Crime;
import com.masai.entities.Criminal;
import com.masai.exceptions.CriminalException;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.exceptions.crimeException;
import com.masai.service.CrimeServiceImpl;
import com.masai.service.CrimeServive;
import com.masai.service.CriminalService;
import com.masai.service.CriminalServiceImpl;
import com.masai.utility.Admin;
import com.masai.utility.FileExists;
import com.masai.utility.IDGeneration;

public class Main {


	  private static void adminFunctions(Scanner sc,Map<Integer, Crime> crime,Map<Integer, Criminal> criminal) throws InvalidDetailsException 
	  {
	    adminLogin(sc);
	    CriminalService CriminalSer= new CriminalServiceImpl();
	    CrimeServive CrimeSer=new CrimeServiceImpl();
	    
	    int choice=0;
	    try {
	    	do {
	    		System.out.println("Press 1 to add criminal");
	    		System.out.println("Press 2 to view all criminals");
	    		System.out.println("Press 3 to delete a criminal record");
	    		System.out.println("Press 4 to update a criminal record");
	    		System.out.println("Press 5 to add crime");
	    		System.out.println("Press 6 to view all crime");
	    		System.out.println("Press 7 to delete a crime");
	    		System.out.println("Press 8 to update a crime");
	    		System.out.println("Press 9 to log out");
	    		choice =sc.nextInt();
	    		
	    		switch(choice) {
	    		case 1:
	    		String added = adminAddCriminal(sc,criminal,CriminalSer);
	    		System.out.println(added);
				break;
				
	    		case 2:
	    			adminViewAllCriminal(criminal,CriminalSer);
	    			break;
	    		case 3:
	    			adminDeleteProduct(sc,criminal,CriminalSer);
	    			break;
	    		case 4:
	    			adminUpdateCriminalRecord(sc,criminal,CriminalSer);
	    			break;
	    		case 5:
		    		String add = adminAddCrime(sc,crime,CrimeSer);
		    		System.out.println(add);
					break;
	    		case 6:
	    			adminViewAllCrime(crime,CrimeSer);
	    			break;
	    		case 7:
	    			adminDeleteCrime(sc,crime,CrimeSer);
	    			break;
	    		case 8:
	    			adminUpdateCrime(sc,crime,CrimeSer);
	    			break;
	    		}
	    	}
	    	while(choice<9);
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	  }
	  public static String adminUpdateCriminalRecord(Scanner sc,Map<Integer,Criminal>criminal,CriminalService CriminalSer)throws CriminalException
	  {
		  String result=null;
		  System.out.println("Please Enter the ID of criminal you want to update: ");
		  int id=sc.nextInt();
		  
		  System.out.println("Enter the updated details ");

		  System.out.println("Enter the criminal name");
		  String name = sc.next();
		  System.out.println("Enter the dob");
		  String dob = sc.next();
	      System.out.println("Enter the gender");
		  String gender = sc.next();
		  System.out.println("Enter the identification_mark");
		  String mark = sc.next();
		  System.out.println("Enter the firstADate");
		  String firstADate = sc.next();
	      System.out.println("Enter the arrestArea");
		  String arrestArea = sc.next();
		  
		  Criminal update=new Criminal(id, name, dob,gender,mark,firstADate,arrestArea);
		  result=CriminalSer.updateRecord(id,update,criminal);
		  
		  return result;
	  }
	  public static String adminUpdateCrime(Scanner sc,Map<Integer,Crime> crime,CrimeServive CrimeSer)throws crimeException {
		  String result =null;
		  System.out.println("Please Enter the ID of crime you want to update: ");
		  int id=sc.nextInt();
		  
		  System.out.println("Enter the updated details ");

		  System.out.println("Enter the crime date");
		  String date = sc.next();
		  System.out.println("Enter the crime type");
		  String type = sc.next();
	      System.out.println("Enter the crime location");
		  String location = sc.next();
		  System.out.println("Enter the Victim's name");
		  String name = sc.next();
		  
		  
		  Crime update=new Crime(id, date, type,location,name);
		  result=CrimeSer.updatecrime(id,update,crime);
		  
		  return result;
	  }
	  
	  public static void adminDeleteProduct(Scanner sc, Map<Integer,Criminal > criminal, CriminalService CriminalSer) throws CriminalException{
		  System.out.println("Please Enter the ID of criminal you want to delete: ");
		  int id=sc.nextInt();
		  CriminalSer.deleteCriminal(id, criminal);
	  }
	  
	  public static void adminDeleteCrime(Scanner sc, Map<Integer,Crime > crime, CrimeServive CrimeSer) throws crimeException{
		  System.out.println("Please Enter the ID of crime you want to delete: ");
		  int id=sc.nextInt();
		  CrimeSer.deleteCrime(id, crime);
	  }
	    
	  public static void adminViewAllCriminal(Map<Integer, Criminal> criminal, CriminalService criminalSer) throws CriminalException {
		  criminalSer.viewAllCriminal(criminal);
	}
	  
	  public static void adminViewAllCrime(Map<Integer, Crime> crime, CrimeServive crimeSer) throws crimeException {
		  crimeSer.viewAllCrimes(crime);
	}

	public static String adminAddCriminal(Scanner sc,Map<Integer, Criminal> criminal,CriminalService criminalSer) {
		  String str=null;
		  	System.out.println("please enter the criminal details");
			System.out.println("Enter the criminal name");
			String name = sc.next();
			System.out.println("Enter the dob");
			String dob = sc.next();
			System.out.println("Enter the gender");
			String gender = sc.next();
			System.out.println("Enter the identification_mark");
			String mark = sc.next();
			System.out.println("Enter the firstADate");
			String firstADate = sc.next();
			System.out.println("Enter the arrestArea");
			String arrestArea = sc.next();

			Criminal crmnl = new Criminal(IDGeneration.generateId(), name, dob,gender,mark,firstADate,arrestArea);
			str =   criminalSer.addCriminal(crmnl, criminal);// considering all details are valid
		    return str;
	  }
	
	  public static String adminAddCrime(Scanner sc,Map<Integer, Crime>crime,CrimeServive CrimeSer) {
		  String str=null;
		  System.out.println("please enter the crime details");
		  System.out.println("Enter crime type: ");
		  String type=sc.next();
		  System.out.println("Enter crime date: ");
		  String date=sc.next();
		  System.out.println("Eneter crime location: ");
		  String location=sc.next();
		  System.out.println("Enter Victim's name: ");
		  String victim=sc.next();
		  
		  Crime crim=new Crime(IDGeneration.generateId(),date,type,location,victim);
		  str=CrimeSer.addCrime(crim,crime);
		  return str;
	  }
	    
	  private static void viewCriminal(Map<Integer, Criminal> criminal, CriminalService criminalSer) throws CriminalException {
		  criminalSer.viewAllCriminal(criminal);
	  }
	  private static void viewCrime(Map<Integer, Crime> crime, CrimeServive crimeSer) throws crimeException{
		  crimeSer.viewAllCrimes(crime);
	  }

	  private static void adminLogin(Scanner sc) throws InvalidDetailsException {
	    
	    System.out.println("Enter Your UserName");
	    String userName = sc.next();
	    System.out.println("Enter Password");
	    String passWord = sc.next();
	    if(userName.equals(Admin.username) && passWord.equals(Admin.password)) {
	      System.out.println("Sussessfully Login Admin");
	    }else {
	      throw new InvalidDetailsException("Invalid");
	    }
	    
	  }

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
		  Map<Integer, Crime> crime = FileExists.crimeFile();
		  Map<Integer, Criminal> criminal = FileExists.criminalFile();
		  
		  CriminalService CriminalSer= new CriminalServiceImpl();
		  CrimeServive CrimeSer=new CrimeServiceImpl();
		  
	    Scanner sc = new Scanner(System.in);
	    System.out.println("welcome in Crime Information Management\r\n"
	    		+ "System, YOUR HELPER");
	    
	    try {
	    
	              int preferences = 0;
	        do {
	      
	      System.out.println("Kindly choose->" + " 1"+" for Admin Login, " + " 2.  view Criminals " + "  3.view crimes "+ "  0. for exit.");
	    
	      preferences = sc.nextInt();
	      
	      switch(preferences) {
	      
	      case 1 :
	        adminFunctions(sc,crime,criminal);
	         break;
	      case 2 :
	        viewCriminal(criminal,CriminalSer);
	        break;
	      case 3 : 
	        viewCrime(crime,CrimeSer);
	        break;
	      case 0 :
	        System.out.println("existed from the System!");
	        break;
	        default : 
	          throw new IllegalArgumentException("Invalid Selection");
	      }
	      
	    
	           }while(preferences != 0);
	    }
	    catch(Exception e) {
	      System.out.println(e.getMessage());
	    }
	  }

}
