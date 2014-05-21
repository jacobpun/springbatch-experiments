package org.punnoose.springbatchdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.punnoose.springbatchdemo.vo.Person;

public class PersonDaoImpl implements PersonDao {

	public List<Person> getPeople() {
		return createFakePeople();
	}


	private List<Person> createFakePeople() {
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 100; i++) {
			people
					.add(createPerson(i));
		}
		return people;
	}

	private Person createPerson(int i) {
		Person person = new Person();
		person.setFirstName("First Name - "+ i);
		person.setLastName("Last Name - "+ i);
		return person;
		
	}
}