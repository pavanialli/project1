package com.niit.online.onlinebooksbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product {
     public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getPaperback() {
		return paperback;
	}
	public void setPaperback(String paperback) {
		this.paperback = paperback;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int productid;
     private String paperback;
     private String language;
     private String publisher;
     private int price;
     private int quatity;
     
     @Transient//data should not store //
     private MultipartFile img;
     
     
     public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	{
    	 
     }  }  

