package com.demo.test;
import java.util.Scanner;
import com.demo.service.*;
import java.util.Map;

public class TestCourseManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseService cservice=new CourseServiceImpl();
		 int choice =0;
		do{ 
		System.out.print("1.disaply all avilable course \n2.Add New course \n3.Display info.of all course by name");
		System.out.print("\n4.Display all course By Seat Capacity  \n5.Delete the course \n6.modiefy the course by name");
		System.out.print("\n7.Modiefy the course by seat capacity  \n8.Show the course in sorted order \n9.exit\n \n");

	
		System.out.print(" select the choice :-> ");
		
		choice=sc.nextInt();
		boolean status;
		switch(choice)
		{
		case 1:
			
		Map<String,Integer>hm=cservice.showALLCourse();
		for(String s:hm.keySet()) 
		{
			System.out.println(hm.get(s));
		}
		
			break;
			
		case 2:boolean see=cservice.addnewcourse();
		if(see){
			System.out.println("course added sucessfully");
		}
		System.out.println("you have entered same couse name ");
		
			break;
			
		case 3:
			System.out.println("enetr coursename to search");
			String cname=sc.next();
			int c=cservice.getInfo(cname);
			if(c!=-1) 
			{
				System.out.println(cname+"--->"+c);
			}
			
			break;
		case 4:
			System.out.println("enetr capacity for search");
			c=sc.nextInt();
			hm=cservice.getByCapacity(c);
			if(hm!=null) {
				for(String s:hm.keySet()) {
					System.out.println(s+"--->"+hm.get(s));
				}
			}else {
				System.out.println("not found");
			}
			
			break;
		case 5:
			System.out.println("enetr coursename to delete");
			cname=sc.next();
			status=cservice.deleteByName(cname);
			if(status) {
				System.out.println("course deleted");
			}else {
				System.out.println("not found");
			}
			break;
		case 6:
			System.out.println("enter coursename to modify");
			cname=sc.next();
			System.out.println("enter new capacity");
			c=sc.nextInt();
			status=cservice.modifycapacity(cname,c);
			if(status)
				System.out.println("modification done");
			else
				System.out.println("not found");
		
			break;
		case 7:
			System.out.println("enter coursename to modify");
			cname=sc.next();
			System.out.println("enter new coursename to modify");
			String newname=sc.next();
			status=cservice.modifycoursename(cname,newname);
			if(status)
				System.out.println("modification done");
			else
				System.out.println("not found");
				
			break;
		case 8:
			hm=cservice.sortByName();
			for(String s:hm.keySet()) {
				System.out.println(s+"--->"+hm.get(s));
			}
			break;
		
		case 9:
			System.out.println("thank for visiting  the center..");
			
			sc.close();
			break;
			
			default :
				System.out.println("opps..! you entered wrong choice \n");
				break;
				
		}
		
		
	}while(choice!=9);

 }
}
