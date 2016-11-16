package edu.cn.qdc;

public class Teacher {

	private int teacherid;
	private String teachername;
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
		return "Teacher [teacherid=" + teacherid + ", teachername=" + teachername + "]";
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
