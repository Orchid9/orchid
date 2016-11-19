package edu.cn.qdc;

public class Contents {

	private String price;
	private String title;// 标题
	private String image;
	private String summary; // 概要
	private String detail; // 正文

	public Contents(String price, String title, String image, String summary, String detail) {
		super();
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
		return "Content [title=" + title + ", summary=" + summary + ", image=" + image + ", detail=" + detail
				+ ", price=" + price + "]";
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
