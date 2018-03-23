/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3816asg1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author zack + miguel
 */
public class Payroll implements Serializable 
{

    private Employee[] myAcct = new Employee[3];

    public static void main(String[] args) throws ParseException, IOException 
    {
        Scanner sc = new Scanner(System.in);

        Payroll pr = new Payroll();

        int input = 0;

        do 
        {

            System.out.print("========================\n"
                    + "EMPLOYEE PAYROLL Menu: \n \n"
                    + "1. POPULATE EMPLOYEE\n"
                    + "2. SELECT EMPLOYEE\n"
                    + "3. SAVE EMPLOYEE\n"
                    + "4. LOAD EMPLOYEE\n"
                    + "5. EXIT\n"
                    + "========================\n"
                    + "\nEnter selection: ");
            input = sc.nextInt();

            switch (input)
            {
                case 1: 
                {
                    pr.populateAccts();
                    break;
                }
                case 2: 
                {
                    pr.selectAcct();
                    break;
                }
                case 3: 
                {
                    pr.saveAcct();
                    break;
                }
                case 4: 
                {
                    pr.loadAcct();
                    break;

                }
                case 5: 
                {
                    break;

                }
            }

        } 
        while (input != 5);
    }

    public void populateAccts() throws ParseException, IOException 
    {
        System.out.println("POPULATE");
        for (int i = 0; i < 3; i++) 
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("What type of Employee is Employee #" + " " + (i + 1));
            System.out.println("\n1) Hourly");
            System.out.println("2) Salary");
            System.out.println("3) Commission");
            int input = sc.nextInt();

            switch (input) 
            {
                case 1: 
                {
                    myAcct[i] = new HourlyEmployee();

                    myAcct[i].setName();
                    myAcct[i].setRate();
                    myAcct[i].setHours();
                    myAcct[i].computeGross();
                    myAcct[i].computeTax();
                    myAcct[i].computeNet();
                    myAcct[i].computeNetPercent();
                    myAcct[i].displayEmployee();

                    break;
                }
                case 2: 
                {
                    myAcct[i] = new SalariedEmployee();

                    myAcct[i].setName();
                    myAcct[i].setRoll();
                    myAcct[i].computeGross();
                    myAcct[i].computeTax();
                    myAcct[i].computeNet();
                    myAcct[i].computeNetPercent();
                    myAcct[i].displayEmployee();

                    break;
                }
                case 3: 
                {
                    myAcct[i] = new CommissionEmployee();

                    myAcct[i].setName();
                    myAcct[i].setUnits();
                    myAcct[i].setUnitrate();
                    myAcct[i].computeGross();
                    myAcct[i].computeTax();
                    myAcct[i].computeNet();
                    myAcct[i].computeNetPercent();
                    myAcct[i].displayEmployee();

                    break;
                }
                case 4: 
                {
                    break;

                }
            }

        }
        selectAcct();

    }

    public void selectAcct() throws ParseException, IOException 
    {
        String input1;
        do 
        {

            Scanner sc = new Scanner(System.in);
            int input;

            System.out.println("Please choose one of the Following account");

            for (int i = 0; i < 3; i++) 
            {
                System.out.println((i + 1) + ")" + "" + myAcct[i].getName());
            }

            input = sc.nextInt();
            myAcct[input - 1].displayEmployee();

            System.out.println("Enter 'Y' to choose a differnt employee or 'N' to Exit");
            input1 = sc.next();

        } 
        while (input1.equalsIgnoreCase("y"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to Save employee (Y/N)? ");
        String input2 = sc.next();

        if (input2.equalsIgnoreCase("y")) 
        {
            saveAcct();
        } 
        else 
        {

        }
    }

    public void saveAcct() throws IOException 
    {

        try 
        {
            FileOutputStream fos = new FileOutputStream("payroll.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(myAcct);
            oos.flush();
            fos.close();
        } 
        catch (Throwable e) 
        {
            System.err.println(e);
        }
        System.out.println("Accounts have been saved");
    }

    public void loadAcct() throws ParseException, IOException 
    {
            Scanner sc = new Scanner(System.in);

        try 
        {
            FileInputStream fis = new FileInputStream("payroll.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            myAcct = (Employee[]) ois.readObject();
            fis.close();
        } 
        catch (Throwable e) 
        {
            System.err.println(e);
        }
    }

}


