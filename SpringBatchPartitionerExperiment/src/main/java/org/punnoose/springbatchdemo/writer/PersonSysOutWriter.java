package org.punnoose.springbatchdemo.writer;

import java.util.List;

import org.punnoose.springbatchdemo.vo.Person;
import org.springframework.batch.item.ItemWriter;

public class PersonSysOutWriter implements ItemWriter<Person> {
	public void write(List<? extends Person> people) throws Exception {
		for (Person person : people) {
			System.out.println(person);
		}
	}
}