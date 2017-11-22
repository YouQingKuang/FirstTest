package com.test4;

public class Person {
	private Integer id;
	private String name;
	private Integer sla;
	
	public Person() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSla() {
		return sla;
	}

	public void setSla(Integer sla) {
		this.sla = sla;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sla=" + sla + "]";
	}
	
	

}
