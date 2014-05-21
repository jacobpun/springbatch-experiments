package org.punnoose.springbatchdemo.processor;

import org.punnoose.springbatchdemo.vo.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonProcessor implements ItemProcessor<Person, Person> {
	public Person process(Person person) throws Exception {
		// Dummy implementation
		return person;
	}
}