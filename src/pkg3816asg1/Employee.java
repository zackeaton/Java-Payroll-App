/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3816asg1;

import java.util.Scanner;
import java.io.Serializable;
import java.text.DecimalFormat;

/**
 *
 * @author zack
 */
public abstract class Employee implements Serializable 
{

    static Scanner sc = new Scanner(System.in);
    double units;
    double unitrate;
    String roll;
    double hours;
    double overTimeHour;
    double rate;
    String name;
    double gross;
    double tax = .20;
    double net;
    double taxrate = .20;
    double netpercent;
    String accountName;

    public void setName()
    {
        System.out.println("Enter name:");
        name = sc.next();
    }

    public String getName() 
    {
        return name;
    }

    public void setRate() 
    {
        System.out.println("Enter pay rate:");
        rate = sc.nextDouble();

    }

    public void setHours() 
    {
        System.out.println("Enter hours worked this week:");
        hours = sc.nextDouble();
    }

    public void setRoll() 
    {
        System.out.println("Set number for roll of Staff or Executive");
        System.out.println("1) Staff");
        System.out.println("2) Executive");

        int input = sc.nextInt();

        if (input == 1) {
            hours = 1;
            rate = 50000 / 52;
        } else {
            hours = 1;
            rate = 100000 / 52;
        }
    }

    public void setUnits() 
    {
        System.out.println("Enter number of units sold this week:");
        units = sc.nextDouble();
    }

    public void setUnitrate() 
    {
        System.out.println("Enter unit rate:");
        unitrate = sc.nextDouble();
    }

    public void computeGross() 
    {
        gross = rate * hours;
    }

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

    protected void displayEmployee()
    {
        
        System.out.println("Hours: " + hours);
        System.out.println("Rate: " + rate);
        System.out.println("Gross: $" + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Taxrate: " + taxrate);
        System.out.println("Net: $" + net);
        System.out.println("Net%: $" + netpercent + "%");
    }


}
