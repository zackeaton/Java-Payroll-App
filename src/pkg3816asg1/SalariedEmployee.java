/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3816asg1;

import java.io.Serializable;

/**
 *
 * @author zack
 */
public class SalariedEmployee extends Employee implements Serializable 
{
    @Override
    public void computeGross() 
    {
        gross = rate;
    }

    @Override
    public void computeTax() 
    {
        tax = gross * taxrate;
    }

    public void computeNet() 
    {
        net = gross - tax;
    }

    public void computeNetPercent() 
    {
        netpercent = (net / gross) * 100;
    }

    public void displayEmployee() 
    {   
        System.out.println("Your Weekly Salary is: $" + rate);
        System.out.println("Gross: $" + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Taxrate: " + taxrate);
        System.out.println("Net: $" + net);
        System.out.println("Net%: " + netpercent + "%");
    }

}
