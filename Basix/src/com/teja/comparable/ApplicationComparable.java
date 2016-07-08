package com.teja.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApplicationComparable {
	@SuppressWarnings("unchecked")
	public static void main(String ... args){
		Collection<Person> people = new ArrayList<>();

		for(int i =1; i<=5; i++){
			Person p = new Person();
			p.setIdPerson(353513L+i);
			p.setGender("M");
			p.setPersonName("person"+i);
			p.setAge(34-i);
			people.add(p);
		}
		
		people.stream().forEach(System.out::println);
		System.out.println("____________________________SORTED____________________________");
		
		Collections.sort((List<Person>) people);
		
		people.stream().forEach(System.out::println);
		
	}

}
