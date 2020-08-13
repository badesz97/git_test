package com.szalai.spring.test.entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Document {

	private int id;
	private String name;
	private String description;
	private List<File> files;

	public Document(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
		files = new ArrayList<File>();
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
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

	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", description=" + description + ", files=" + files + "]";
	}
	

}
