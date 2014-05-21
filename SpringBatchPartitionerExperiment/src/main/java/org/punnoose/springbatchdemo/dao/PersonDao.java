package org.punnoose.springbatchdemo.dao;

import java.util.List;

import org.punnoose.springbatchdemo.vo.Person;

public interface PersonDao {
	List<Person> getPeople();
}
