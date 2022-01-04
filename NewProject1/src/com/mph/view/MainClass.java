package com.mph.view;
import java.util.Scanner;
import com.mph.controller.*;
import com.mph.model.*;
public class MainClass 
{
   public static void main(String[]args) 
   {    
	    System.out.println("Welcome , which operation do you want to perform?");
	    System.out.println("1:Addition");
	    System.out.println("2:Substraction");
	    System.out.println("3:Multliplication");
	    System.out.println("4:Division");
	    Controller c = new Controller();
	    
	    Scanner sc = new Scanner(System.in);
	   
	    int x = sc.nextInt();
	    
	    switch(x)
	    {
	    case 1:{ c.add();
	    break;}
	    
	    case 2: {c.substract();
	    break;}
	    
	    case 3:{ c.mult();
	    break;}
	    case 4: {c.divide();
	    break;
	    }
	    
	    default: { System.out.println("Choose the correct operation");
	    break;
	    }
	    }
   }
}
