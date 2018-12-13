package org.github.fabiolimace.small.pfm.model;

import java.util.UUID;

import org.github.fabiolimace.small.pfm.enums.AccountType;

public class Account {

	protected UUID id;
	protected AccountType type;
	protected String name;
	protected String description;
	protected boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
