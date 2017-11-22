package com.test4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPre {
	public static void main(String[] args) {
		
//		List<Person> list = new ArrayList<Person>();
		
		Predicate<Person> flag = p->p.getId()>100;
		Person p1 = new Person();
		p1.setId(10);
		Person p2 = new Person();
		p2.setId(100);
		Person p3 = new Person();
		p3.setId(1000);
		
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
		
//		List<Person> newList = tata(list, p-> p.getId()>100);
		
//		System.out.println(newList);
		System.out.println(flag.test(p1));
		System.out.println(flag.test(p2));
		System.out.println(flag.test(p3));
		
	}
	
//	public static List<Person> tata(List<Person> list,Predicate<Person> flag){
//		List<Person> newList = new ArrayList<Person>();
//		
//		for (Person person : list) {
//			if(flag.test(person)) {
//				newList.add(person);
//			}
//		}
//		return newList;
//	}
	
	
}
