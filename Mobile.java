package edu.mrk.john.mobilestore.models;

public class Mobile {
	private Long id;
	private String owner;
	private String brand;
	private Double price;
	
	
	public Mobile(Long id, String owner, String brand, Double price) {
		super();
		this.id = id;
		this.owner = owner;
		this.brand = brand;
		this.price = price;
	}
	/*public Mobile(Long id,String owner,String brand,Double price) {
		this.id = id;
		this.owner = owner;
		this.brand = brand;
		this.price = price;
	}*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	/*public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Double getPrice() {
		return this.price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}*/
}
