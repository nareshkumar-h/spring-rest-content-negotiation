package com.naresh.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="user")
public class User {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;

	public User(String name) {
		this.name = name;
	}

}
