package org.punnoose.springbatch.mutiresourcepartitioner.domain;

public class Organization {
	private String id;
	private String name;
	private float salesRevenue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalesRevenue() {
		return salesRevenue;
	}

	public void setSalesRevenue(float salesRevenue) {
		this.salesRevenue = salesRevenue;
	}

	@Override
	public String toString() {
		return "ID: " + getId() + ", NAME: " + getName() + ", SALES: "
				+ getSalesRevenue();
	}
}
