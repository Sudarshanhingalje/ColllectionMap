package com.demo.test;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class TestMapdemo00 {

	public static void main(String[] args) {
//PASS LIST as THE VALUE
//Map<String,List<String>> hm =new HashMap<>();
//List<String>lst=new ArrayList<>();
//lst.add("redmi");
//lst.add("Oppo");
//lst.add("Samsang");
//lst.add("Micromax");
//lst.add("Iphone");
//lst.add("OnePlus");
//lst.add("Motrola");
//lst.add("NothingPhone");
//
////System.out.println(lst);
//hm.put("GooglePixle",lst);
//System.out.println(hm);
//
//List<String>lst2=new ArrayList<>();
//lst2.add("Pentonic");
//lst2.add("Mark");
//lst2.add("BollPen");
//lst2.add("Lexic");
//lst2.add("LincWaierProoof");
// System.out.println(lst2);
// hm.put("Parker", lst2);
// System.out.print(hm);
 
 Map<Integer,List<Integer>>hm1=new HashMap<>();
 List<Integer> lst3=new ArrayList<>();
 
 lst3.add(1000);
 lst3.add(2000);
 lst3.add(3000);
 lst3.add(4000);
 lst3.add(5000);
 System.out.println(lst3);
 
 hm1.put(6000,lst3);
 System.out.println(hm1);
 
 

	}

}
