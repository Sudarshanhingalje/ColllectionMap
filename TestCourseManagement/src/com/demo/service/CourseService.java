package com.demo.service;

import java.util.Map;


public interface CourseService {

	boolean addnewcourse();

	Map<String, Integer> showALLCourse();

	int getInfo(String cname);

	Map<String, Integer> getByCapacity(int c);

	boolean deleteByName(String cname);

	boolean modifycapacity(String cname, int c);

	boolean modifycoursename(String cname, String newname);

	Map<String, Integer> sortByName();

}
