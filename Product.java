package com.niit.online.onlinebooksbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
@Component
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int productid;
	
	@Min(1)
    private int price;
	
	@Min(1)
    private int quatity;
	
    private String prodname;
    
    @ManyToOne
    @JoinColumn(name = "catid" , insertable = false, updatable = false)
    private Category category;
    private int catid;
    
   @ManyToOne
   @JoinColumn(name = "id" , insertable = false, updatable = false)
   private Supplier supplier;
   private int id;
   
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}


}
