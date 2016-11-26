package edu.cn.qdc;

public class Contents {

	private int id;
	private double price;
	private String title;// 标题
	private String image;
	private String summary; // 概要
	private String detail; // 正文

	public Contents(double price, String title, String image, String summary, String detail) {
		super();
		this.price = price;
		this.title = title;
		this.image = image;
		this.summary = summary;
		this.detail = detail;
	}

	public Contents(int id, double price, String title, String image, String summary, String detail) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
		this.image = image;
		this.summary = summary;
		this.detail = detail;
	}

	public Contents() {
		super();
	}

	@Override
	public String toString() {
		return "Contents [id=" + id + ", price=" + price + ", title=" + title + ", image=" + image + ", summary="
				+ summary + ", detail=" + detail + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
