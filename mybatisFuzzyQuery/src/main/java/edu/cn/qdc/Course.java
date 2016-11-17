package edu.cn.qdc;

public class Course {

	private int id;
	private String coursename;
	public Course(int id, String coursename) {
		super();
		this.id = id;
		this.coursename = coursename;
	}
	public Course() {
		super();
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
}
