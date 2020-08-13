package com.szalai.spring.test.entity;

import java.io.File;

public class TestFile extends File{
	private static final long serialVersionUID = 1L;
	private int id;
	private String company;
	private String filePath;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public TestFile(String pathname, int id, String company, String filePath) {
		super(pathname);
		this.id = id;
		this.company = company;
		this.filePath = filePath;
	}

	public TestFile(String pathname) {
		super(pathname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestFile [id=" + id + ", company=" + company + ", filePath=" + filePath + "]";
	}
}
