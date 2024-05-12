package com.demo.service;
import com.demo.dao.*;

import java.util.Map;
import java.util.Scanner;


public class CourseServiceImpl implements CourseService{
 
	private CourseDao cdao;
	
	public CourseServiceImpl() {    /// constructor is created default to intailize cdao every time
		super();
		cdao=new CourseDaoImpl();
	}
	
	

	@Override
	public boolean addnewcourse() {
		Scanner sc= new Scanner(System.in);

		System.out.println("enter the new course name");
		String nm=sc.next();
		System.out.println("enter the seat capacity for course");
		int cap =sc.nextInt();
		return cdao.save(nm,cap);
		
	}



	@Override
	public Map<String, Integer> showALLCourse() {
		
		return cdao.showALL();
	}
	
	
	@Override
	public int getInfo(String cname) {
		return cdao.findInfo(cname);
	}

	@Override
	public Map<String, Integer> getByCapacity(int c) {
		return cdao.findByCapacity(c);
	}

	@Override
	public boolean deleteByName(String cname) {
		return cdao.removeByName(cname);
	}

	@Override
	public boolean modifycapacity(String cname, int c) {
		return cdao.updateCapacity(cname,c);
	}

	@Override
	public boolean modifycoursename(String cname, String newname) {
		return cdao.updateCoursename(cname,newname);
		
	}

	@Override
	public Map<String, Integer> sortByName() {
		return cdao.arrangeByName();
	}
	
	

}


