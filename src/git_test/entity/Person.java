package git_test.entity;

public class Person {

	private int id;
	private String name;
	private String description;
	private Company company;
	private Document document;
	
	public Person(int id, String name, String description, Company company, Document document) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.company = company;
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "Person [id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", company=" + this.company + ", document="+ this.document + "]";
	}

}
