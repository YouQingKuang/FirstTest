package com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StudentTest {
	public static void main(String[] args) {
		
		Integer[] score = {100,95,90,85,80,75,70,60};
		List<Student> allStudent = new ArrayList<Student>();
		
		for (int i = 0; i < 50; i++) {
			int scoreIndex = (int) (Math.random()*8);
			//System.out.println(stuScore);
			Student stu = new Student(i, "学生"+i);
			stu.setScore(score[scoreIndex]);
			allStudent.add(stu);
		}
		
//		for (Student student : allStudent) {
//			System.out.println(student);
//		}
		
		Stream<Student> streamAllStudent = allStudent.stream();
		//streamAllStudent.forEach(System.out::println);
		Map<Integer, List<Student>> collect = streamAllStudent.collect(groupingBy(Student::getScore));
		collect.forEach((k,y)->y.forEach(e->System.out.println(k+" "+e.getId()+" "+e.getName())));
		
//		Stream<Student> filter = streamAllStudent.filter(stu->stu.getScore()==100);
//		filter.forEach(e->System.out.println(e.getId()+"  "+e.getName()));
		
		
	}
}
