package com.product;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	//private List<Product> relatedProducts;
	private String relatedProducts;
	public String getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(String relatedProducts) {
		this.relatedProducts = relatedProducts;
	}

	private String linkImage;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public List<Product> getRelatedProducts() {
		return relatedProducts;
	}

	public void setRelatedProducts(List<Product> relatedProducts) {
		this.relatedProducts = relatedProducts;
	}*/

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public Product(String id, String name, String description, String relatedProducts, String linkImage) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.relatedProducts = relatedProducts;
		this.linkImage = linkImage;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
