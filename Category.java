package com.niit.online.onlinebooksbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="category")
public class Category {
	
	
     private String comicbooks;
     private String storybooks;
     private String Biography;
     @Id
 	@GeneratedValue(strategy=GenerationType.AUTO)
 	
     private int id;
     
     
     public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Transient//data should not store //
     private MultipartFile img;
     
	public String getComicbooks() {
		return comicbooks;
	}
	public void setComicbooks(String comicbooks) {
		this.comicbooks = comicbooks;
	}
	public String getStorybooks() {
		return storybooks;
	}
	public void setStorybooks(String storybooks) {
		this.storybooks = storybooks;
	}
	public String getBiography() {
		return Biography;
	}
	public void setBiography(String biography) {
		Biography = biography;
	}
}
