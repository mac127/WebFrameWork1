package kr.ac.hansung.model;

public class Subject {
	@Override
	public String toString() {
		return "Subject [id=" + id + ", year=" + year + ", semester=" + semester + ", name=" + name + ", division="
				+ division + ", credit=" + credit + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	private String id;
	private int year;
	private int semester;
	private String name;
	private String division;
	private int credit;
}