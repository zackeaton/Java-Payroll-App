/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3816asg1;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author zack
 */
    // Fig. 10.4: Employee.java
    // Employee abstract superclass.



   public abstract class Employee
   {
      private String firstName;
      private String lastName;
      private String ssn;
      
    /**
     *
     */
    public String accountName;


      // three-argument constructor
      public Employee( String first, String last, String ssn )
      {
          
          
        float rate=30.0f;
	float taxrate=0.2f;
	int hours=40;
	float gross=0.0f;
	float tax=0.0f;
	float net=0.0f;
	float net_percent=0.0f;
          
         firstName = first;
         lastName = last;

      } // end three-argument Employee constructor

      // set first name
      public void setFirstName( String first )
      {
         firstName = first; // should validate
      } // end method setFirstName

      // return first name
      public String getFirstName()
      {
         return firstName;
      } // end method getFirstName

      // set last name
      public void setLastName( String last )
      {
         lastName = last; // should validate
      } // end method setLastName

      // return last name
      public String getLastName()
      {
         return lastName;
      } // end method getLastName

      // set social security number
      
      // return String representation of Employee object
      @Override
      public String toString()
      {
         return String.format( "%s %s\nsocial security number: %s",
            getFirstName(), getLastName() );      } // end method toString

      // abstract method overridden by concrete subclasses        
      public abstract double earnings(); // no implementation here
      
      
   //} // end abstract class Employee

public void transMenu() throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        
        int input = 0;

        while (input != 4) 
        {
         System.out.print("========================\n"
							 +"EMPLOYEE PAYROLL Menu: \n \n"
							 + "1. HOURLY EMPLOYEE \n"
							 + "2. SALARY EMPLOYEE \n"
							 + "3. COMMISSION EMPLOYEE\n"
							 + "4. EXIT\n"
							 + "========================\n"
							 + "\nEnter selection: ");
            input = sc.nextInt();

            switch (input) //Switch Case for MENU
            {
                case 1: //HOURLY
                {
                   /// PROMPT HOURS
                   
                   // PROMPT RATE
                   
                   // CAL FOR TIME AND HALF
                    
                    break;
                }
                
                case 2: //SALARY
                {
                    // PROMPT FOR STAFF OR EXCE
                    
                    //SET SALARY 50K and 100k
                    
                    break;
                }
                
                case 3: //COMMISSION
                {
                   // PROMPT # ITEMS SOLD
                   
                   // PROPMPT UNIT PRICE
                   
                   //COMMISSION IS 50% OF GROSS SALES
                    
                    break;
                }
                
                case 4: //Quit 
               {
                    break;

                }
            }//END SWITCH  
            
        }// END WHILE
    }//CLOSE TRANS MENU

    }



/////
//////////
//////////    /*********************
//////////	     Attributes
//////////	*********************/
//////////
//////////	//End Attributes
//////////        
//////////        /********************
//////////	     Constructors
//////////	********************/
//////////        public Employee()
//////////        {
//////////            
//////////        }
//////////        	
//////////	/********************
//////////	     Methods
//////////	********************/
//////////        public void menu()
//////////        {
//////////            
//////////        }
//////////         
//////////	public void computeGross()
//////////        	{ 
//////////		gross=rate*hours;
//////////	}
//////////
//////////	protected void computeTax() 
//////////{ 
//////////		tax=gross*taxrate;
//////////	}
//////////
//////////	protected void computeNet()
////////// { 
//////////		net=gross-tax;
//////////	}
//////////
//////////	protected void computeNetperc() 
//////////{ 
//////////		net_percent=(net/gross)*100;
//////////	}
//////////	
//////////	protected void displayEmployee() 
//////////{
//////////		System.out.println("Hours: " + new Integer(hours));
//////////		System.out.println("Rate: " + new Float(rate));
//////////		System.out.println("Gross: " + new Float(gross));
//////////		System.out.println("Net: " + new Float(net));
//////////		System.out.println("Net%: " + new Float(net_percent) + "%");
//////////	}
//////////} 	
//////////
