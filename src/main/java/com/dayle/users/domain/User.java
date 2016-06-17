package com.dayle.users.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;

    @Column(name = "userName", nullable = false, unique = true)
    private String userName;

    @Column(name = "age")
    private int age;

    public User(Long id, String firstName, String lastName, String userName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.age = age;
	}
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public String toString(){
        return this.firstName + this.lastName;
    }

}
