package com.masai;
import java.util.Map;
import java.util.Scanner;

import com.masai.entities.*;
import com.masai.exceptions.InvalidDetailsException;
import com.masai.service.*;
import com.masai.utility.*;

public class Main {


	  private static void adminFunctions(Scanner sc,Map<Integer, Crime> crime,Map<Integer, Criminal> criminal) throws InvalidDetailsException 
	  {
	    adminLogin(sc);
	    CriminalServiceImpl CriminalSer= new CriminalServiceImpl();
	    CrimeServiceImpl CrimeSer=new CrimeServiceImpl();
	    
	    int choice=0;
	    try {
	    	do {
	    		System.out.println("Press 1 to add criminal");
	    		System.out.println("Press 2 to view all criminals");
	    		System.out.println("Press 3 to delete a criminal record");
	    		System.out.println("Press 4 to log out");
	    		choice =sc.nextInt();
	    		
	    		switch(choice) {
	    		case 1:
	    		String added = adminAddCriminal(sc,criminal,CriminalSer);
	    		System.out.println(added);
				break;
	    		}
	    	}
	    	while(choice<4);
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	  }
	    
	  public static String adminAddCriminal(Scanner sc,Map<Integer, Criminal> criminal,CriminalServiceImpl criminalSer) {
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
			str =   CriminalServiceImpl.addCriminal(crmnl, criminal);// considering all details are valid
		    return str;
	  }
	    
	  private static void viewCriminal() {
		  
	  }
	  private static void viewCrime() {
		  
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
	        viewCriminal();
	        break;
	      case 3 : 
	        viewCrime();
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
