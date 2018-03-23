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
public class HourlyEmployee extends Employee implements Serializable 
{

    @Override
    public void computeGross() 
    {
        if (hours > 40) 
        {
            overTimeHour = hours - 40;
            gross = (rate * 40) + ((rate * 1.5) * overTimeHour);
        } 
        else 
        {
            gross = rate * hours;
        }

    }

    @Override
    public void displayEmployee() 
    {
        System.out.println("Hours: " + hours);
        System.out.println("Rate: $" + rate + " per hour ");
        System.out.println("Overtime Hours: " + overTimeHour);
        System.out.println("Gross: $" + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Taxrate: " + taxrate);
        System.out.println("Net: $" + net);
        System.out.println("Net%: " + netpercent + "%");
    }
}
