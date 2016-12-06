package spring4.jdbc;

public class Content {
	private int id;
	private double price;
	private String title;
	private String icon;
	private String abstracts;
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getAbstracts() {
		return abstracts;
	}
	public void setAbstracts(String abstracts) {
		this.abstracts = abstracts;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Content(int id, double price, String title, String icon, String abstracts, String text) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
		this.icon = icon;
		this.abstracts = abstracts;
		this.text = text;
	}
	
	public Content() {
		super();
	}
	@Override
	public String toString() {
		return "Content [id=" + id + ", price=" + price + ", title=" + title + ", icon=" + icon + ", abstracts="
				+ abstracts + ", text=" + text + "]";
	}
	
}
