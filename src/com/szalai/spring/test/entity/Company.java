package com.szalai.spring.test.entity;


public class Company {
	
	private int id;
	private String name;
	private String description;
	private Document document;
	
	public Company(int id, String name, String description, Document document) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.document = document;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "Company [id=" + this.id + ", name=" + this.name + ", description=" + this.description +  ", document=" + this.document + "]";
	}

}
