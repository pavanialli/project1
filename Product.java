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
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private int productid;
     private int price;
     private int quatity;
     private String prodname;
     @Transient
     private MultipartFile image;
     
     public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public int getProductid() {
 		return productid;
 	}
 	public void setProductid(int productid) {
 		this.productid = productid;
 	}
 	
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

	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	{
    	 
     }  }  

