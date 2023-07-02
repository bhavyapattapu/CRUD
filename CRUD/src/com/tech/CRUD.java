package com.tech;

	import java.util.*;
	public class CRUD {
	    public static void main(String[] args) {
	        Employee e1=new Employee("rajesh","ameerpet","hyd");
	        Employee e2=new Employee("Suresh","uppal","hyd");
	        Employee e3=new Employee("rajesh","Koti","hyd");
	        
	        Map<Integer,Employee> m=new HashMap<Integer,Employee>();
	        m.put(101, e1);
	        m.put(102, e2);
	        m.put(103, e3);        
	        
	        
	        System.out.println("1. read an Employee");//Read
	        System.out.println("2  create an employee");//create or insert
	        System.out.println("3. delete an employee");//delete
	        System.out.println("4  update an employee");//update
	        Scanner sc=new Scanner(System.in);
	        System.out.println("please select your option");
	        int option=sc.nextInt();
	        switch(option) {
	        case 1:
	        {
	            System.out.println("Your option is read an employee");
	            System.out.println("Which record your going to read");
	            int record=sc.nextInt();
	            Employee e=m.get(record);
	            System.out.println(e);
	            break;
	        }
	        case 2:
	        {
	        	System.out.println("Your option is to insert an employee");
	        	System.out.println("Which record your going to insert");
	        	int record=sc.nextInt();
	        	Employee e=m.get(record);
	        	System.out.println(e);
	        	break;
	        }
	        case 3:
	        {
	        	System.out.println("Your option is to delete an employeee");
	        	System.out.println("Which record  your going to delete");
	        	int record=sc.nextInt();
	        	Employee e=m.get(record);
	        	System.out.println(e);
	            break;
	        }
	        case 4:
	        {
	        	System.out.println("Your option is to update an employee");
	        	System.out.println("Which record your going to update");
	        	int record=sc.nextInt();
	        	Employee e=m.get(record);
	        	System.out.println(e);
	            break;
	        }
	        default:
	        {
	            System.out.println("your input doen't match");
	        }
	        }    
	    }}



