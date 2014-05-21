package org.punnoose.springbatchdemo.partition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.punnoose.springbatchdemo.dao.PersonDao;
import org.punnoose.springbatchdemo.vo.Person;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

public class PeoplePartitioner implements Partitioner {

	private PersonDao personDao;

	public Map<String, ExecutionContext> partition(int gridSize) {

		System.out.printf("Grid size is: %s \r\n",gridSize);
		
		Map<String, ExecutionContext> partitions = new HashMap<String, ExecutionContext>();

		List<Person> people = getPersonDao().getPeople();

		List<List<Person>> peopleSplited = splitList(
				people, gridSize);

		System.out.printf("Person List is splitted into %d sublists\r\n",
				peopleSplited.size());

		// Assign each split to a Partition
		int counter = 1;
		for (List<Person> subList : peopleSplited) {
			ExecutionContext context = new ExecutionContext();
			context.put("PersonList", subList);
			partitions.put("Partition_" + counter, context);
			counter++;
		}

		return partitions;
	}

	/**
	 * Splits a given list to 'n' sub lists
	 * 
	 * @param listTobeSplited
	 * @param countOfSplits
	 * @return
	 */
	private <T> List<List<T>> splitList(List<T> listTobeSplited, int countOfSplits) {
		List<List<T>> parts = new ArrayList<List<T>>();
		final int size = listTobeSplited.size();
		final int countOfItemsPerSplit = (int) Math.ceil((double)size/countOfSplits);

		for (int i = 0; i < size; i += countOfItemsPerSplit) {
			ArrayList<T> subList =new ArrayList<T>(listTobeSplited.subList(i, Math.min(size, i + countOfItemsPerSplit))); 
			parts.add(subList);
		}
		return parts;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}