package org.punnoose.springbatch.mutiresourcepartitioner.batch;

import java.util.List;

import org.punnoose.springbatch.mutiresourcepartitioner.domain.Organization;
import org.springframework.batch.item.ItemWriter;

public class OrganizationDataWriter implements ItemWriter<Organization> {

	public void write(List<? extends Organization> organizations) throws Exception {
		
		//Dummy Implementation of writer
		for (Organization organization : organizations) {
			System.out.println(organization);
		}
	}
}
