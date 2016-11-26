package edu.cn.qdc;

import java.util.Date;

public class Trx {
	
	private int id;
	private int contentId;
	private int personId;
	private double price;
	private Date time;
	private Contents contents;
	public Trx(int id, int contentId, int personId, double price, Date time) {
		super();
		this.id = id;
		this.contentId = contentId;
		this.personId = personId;
		this.price = price;
		this.time = time;
	}
	public Trx(int contentId, int personId, double price, Date time) {
		super();
		this.contentId = contentId;
		this.personId = personId;
		this.price = price;
		this.time = time;
	}
	public Trx() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Contents getContents() {
		return contents;
	}
	public void setContents(Contents contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return "Trx [id=" + id + ", contentId=" + contentId + ", personId=" + personId + ", price=" + price + ", time="
				+ time + ", contents=" + contents + "]";
	}
	
}
