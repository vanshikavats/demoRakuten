/**
 * 
 */
package com.rakuten.prj.entity;

/**
 * This is a business data to represent product information
 * 
 * @author vanishika
 * @version 1.0
 */
public abstract class Product {
	private int id;
	private String name;
	private double price;
	/**
	 * 
	 */
	public Product() {
	}
	/**
	 * @param id: product's id
	 * @param name: name of the product
	 * @param price: price of the product
	 */
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * this method is to find if the product is expensive or not
	 * 
	 * @return
	 */
	public abstract boolean isExpensive();

}
