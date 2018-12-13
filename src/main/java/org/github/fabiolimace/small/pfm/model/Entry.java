package org.github.fabiolimace.small.pfm.model;

import java.util.UUID;

import org.github.fabiolimace.small.pfm.enums.EntryType;

public class Entry {

	protected UUID id;
	protected EntryType type;
	protected Number ammount;
	protected Account account;
	protected String description;
	protected boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public EntryType getType() {
		return type;
	}

	public void setType(EntryType type) {
		this.type = type;
	}

	public Number getAmmount() {
		return ammount;
	}

	public void setAmmount(Number ammount) {
		this.ammount = ammount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
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
