package com.teja.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ApplicationComparator {
	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		Collection<Person> people = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Person p = new Person();
			p.setIdPerson(353513L + i);
			p.setGender("M");
			p.setPersonName("person" + i);
			p.setAge(34 - i);
			people.add(p);
		}
		Person p = new Person();
		p.setIdPerson(353513L + 6);
		p.setGender("M");
		p.setPersonName("person" + 6);
		p.setAge(33);
		people.add(p);
		
		p = new Person();
		p.setIdPerson(353513L);
		p.setGender("M");
		p.setPersonName("person" + 7);
		p.setAge(32);
		people.add(p);

		people.stream().forEach(System.out::println);
		System.out.println("____________________________SORTED BY AGE____________________________");

		Collections.sort((List<Person>) people, new AgeComparator());

		people.stream().forEach(System.out::println);
		
		System.out.println("____________________________SORTED BY ID____________________________");

		Collections.sort((List<Person>) people, new IdComporator());

		people.stream().forEach(System.out::println);

	}

}
