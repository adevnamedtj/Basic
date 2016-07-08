package com.teja.comparator;

import java.util.Comparator;

public class IdComporator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return (o1.getIdPerson() > o2.getIdPerson() ? -1 : o1.getIdPerson() < o2.getIdPerson() ? 1 : 0);
	}
	

}
