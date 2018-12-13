package org.github.fabiolimace.small.pfm.model;

import java.util.UUID;

import org.github.fabiolimace.small.pfm.enums.BookType;

public class Book {
	
	protected UUID id;
	protected BookType type;
	protected User user;
	protected String name;
	protected String description;
	protected boolean template;
	protected boolean active;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public BookType getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public boolean isTemplate() {
		return template;
	}
	public void setTemplate(boolean template) {
		this.template = template;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
