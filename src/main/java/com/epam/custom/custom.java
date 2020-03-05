package com.epam.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class custom{
	static Scanner sc = new Scanner(System.in);   
	public void customList() {
   	List<String> list = new ArrayList<String>();
   	list.add("ramu");
   	list.add("rajesh");
   	list.add("Hrithik");
   	list.add("Sharukh");
   	list.add("Roshan");
   	list.add("katrina");
   	list.add("Aishwarya");
   	int choice;
   	boolean flag = true;
   	while(flag) {
   		System.out.println("Enter your choice:\n1.Adding at specific index\t2.removing\t3.Printing\t4.Fetching\t5.exit");
   		choice = sc.nextInt();
   		switch(choice) {
   		case 1: System.out.println("Enter index and element");
   		        String str = sc.next();
   			    list.add(str);
   		         break;
   		case 2:  list.remove(sc.nextInt());
   		          break;
   		case 3:    ListIterator<String> iterator = list.listIterator();
   	               while(iterator.hasNext()) { 
                          System.out.print(iterator.next()+" "); 
                      }
   	               System.out.println();
   		           break;
   		case 4:  System.out.println("Enter index");
   			      int index = sc.nextInt();
   			      System.out.println(list.get(index));     
   		case 5:   flag = false;
   		          break;
   		default: System.out.println("Invalid choice");
   		}
   	}
}

}