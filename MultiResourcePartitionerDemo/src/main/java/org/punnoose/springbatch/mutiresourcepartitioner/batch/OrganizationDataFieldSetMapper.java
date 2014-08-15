package org.punnoose.springbatch.mutiresourcepartitioner.batch;

import org.punnoose.springbatch.mutiresourcepartitioner.domain.Organization;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class OrganizationDataFieldSetMapper implements
		FieldSetMapper<Organization> {

	public Organization mapFieldSet(FieldSet fieldSet) throws BindException {
		Organization organizaion = new Organization();		
		organizaion.setId(fieldSet.readString("COMPANY_ID"));
		organizaion.setName(fieldSet.readString("COMPANY_NAME"));
		organizaion.setSalesRevenue(fieldSet.readFloat("SALES"));
		return organizaion;
	}
}