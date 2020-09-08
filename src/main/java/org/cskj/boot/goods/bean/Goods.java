package org.cskj.boot.goods.bean;

public class Goods {
	private int id;
	private String name;
	private int price;
	private String weight;
	private String createDate;
	private String keepDate;
	private String content;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getKeepDate() {
		return keepDate;
	}
	public void setKeepDate(String keepDate) {
		this.keepDate = keepDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Goods(int id, String name, int price, String weight, String createDate, String keepDate, String content) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.createDate = createDate;
		this.keepDate = keepDate;
		this.content = content;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", createDate="
				+ createDate + ", keepDate=" + keepDate + ", content=" + content + "]";
	}
	
	
}
