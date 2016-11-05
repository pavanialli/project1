package com.niit.online.onlinebooksbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User")


public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    
    @NotNull(message="name should not be empty")
	private String username;
    
    @NotNull(message="password should be 5 to 6 charactrs")
	private String password;
    
    
    @Transient
    private String confirmpassword;
    
    public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	@NotNull(message="email should not be empty")
    private String emailid;
    
    @NotNull(message="enter a number")
	private String phno;
    
    
	private String enabled;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
}
