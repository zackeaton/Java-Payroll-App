/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3816asg1;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 *
 * @author zack
 */
public class CommissionEmployee extends Employee 
{

    public void computeGross() 
    {
        gross = (units * unitrate) / 2;
    }

    public void displayEmployee() 
    {
        System.out.println("Units: " + units);
        System.out.println("Unit rate: " + unitrate + " per unit ");
        System.out.println("Gross: $" + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Taxrate: " + taxrate);
        System.out.println("Net: $" + net);
        System.out.println("Net%: " + netpercent + "%");
    }

} // end class CommissionEmployee
