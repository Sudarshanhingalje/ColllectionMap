package com.demo.dao;
import java.util.HashMap;
import java.util.Map;

public class CourseDaoImpl implements CourseDao
{
	
	
	//Creating sample dada for testing static 
	static Map<String,Integer> hm=new HashMap<>();
	static 
	{
		hm.put("AIML", 240);
		hm.put("BCA", 200);
		hm.put("MCA",300);
		hm.put("CSE", 240);
		
	}
	
	@Override
	public Map<String, Integer> showALL() { 
		
	
		return hm;
	} 

	@Override
	public boolean save(String nm, int cap)
 {
        if(!hm.containsKey(nm))
   {
	      hm.put(nm,cap);
	      return true;
   } else
    {   return false;
	}
 }

}
