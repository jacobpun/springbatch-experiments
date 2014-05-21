package org.punnoose.springbatchdemo.reader;

import java.util.List;

import org.punnoose.springbatchdemo.vo.Person;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class PersonReader implements ItemReader<Person> {

	private List<Person> people;

	public Person read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		if (!getPeople().isEmpty()) {
			Person person = getPeople()
					.remove(0);
			return person;
		}
		return null;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
}