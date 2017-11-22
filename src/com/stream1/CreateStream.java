package com.stream1;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateStream {
	public static void main(String[] args) {
		String[] str = {"lala","read","cts"};
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		System.out.println(map);
		
		//创建str的Stream
		Stream<String> stream = Arrays.stream(str);
		//将数组转换成list
		List<String> listOfString = stream.collect(toList());
		//collect
		//stream.collect(toList());
		List<String> collect = Stream.of("adawd","dwa","dwsss").collect(toList());
		//System.out.println(collect);
		//collect.forEach(e->System.out.println(e+"a"));
		
		collect.forEach(System.out::println);
		collect.add("sdaaaaa");
		//System.out.println(collect);
		Stream<HashMap<Integer, String>> mapStream = Stream.of(map);
		//mapStream.map((e,r)->);
		//Stream.of("中文","字符串").map(String::length).forEach(System.out::println);
		Stream.of("中文","字符串").map(e->e.length()).forEach(System.out::println);
				
	}
}
