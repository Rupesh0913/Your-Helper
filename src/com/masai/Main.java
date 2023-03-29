package com.masai;
import java.util.Scanner;

import com.masai.exceptions.InvalidDetailsException;
import com.masai.utility.Admin;

public class Main {

	private static void customerSignUp() {
	    // TODO Auto-generated method stub
	    
	  }

	  private static void customerFunctions() {
	    // TODO Auto-generated method stub
	    
	  }

	  private static void adminFunctions(Scanner sc) throws InvalidDetailsException {
	    // TODO Auto-generated method stub
	    adminLogin(sc);
	  }

	  private static void adminLogin(Scanner sc) throws InvalidDetailsException {
	    // TODO Auto-generated method stub
	    
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

	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Hey welcome");
	    
	    try {
	    
	              int preferences = 0;
	        do {
	      
	      System.out.println("Kindly choose->" + " 1"+" for Admin Login, " + " 2.  for " + "  3.  for  "+ "  0. for exit.");
	    
	      preferences = sc.nextInt();
	      
	      switch(preferences) {
	      
	      case 1 :
	        adminFunctions(sc);
	         break;
	      case 2 :
	        customerFunctions();
	        break;
	      case 3 : 
	        customerSignUp();
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
