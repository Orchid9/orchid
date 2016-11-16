package edu.cn.qdc;

import java.util.List;

public class Teacher {

	private int teacherid;
	private String teachername;
	private List<Course> course;

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Teacher(int teacherid, String teachername) {
		super();
		this.teacherid = teacherid;
		this.teachername = teachername;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [teacherid=" + teacherid + ", teachername=" + teachername + ", course=" + course + "]";
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

}
