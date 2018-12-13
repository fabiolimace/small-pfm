package org.github.fabiolimace.small.pfm.model;

import java.util.UUID;

import org.github.fabiolimace.small.pfm.enums.Operation;
import org.github.fabiolimace.small.pfm.enums.PermissionSubtype;
import org.github.fabiolimace.small.pfm.enums.PermissionType;
import org.github.fabiolimace.small.pfm.enums.Role;

public class Permission {

	protected UUID id;
	protected PermissionType type;
	protected PermissionSubtype subtype;
	protected Operation operation;
	protected Role role;
	protected User user;
	protected Book book;
	protected Account account;
	protected Resource resource;
	protected boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public PermissionType getType() {
		return type;
	}

	public void setType(PermissionType type) {
		this.type = type;
	}

	public PermissionSubtype getSubtype() {
		return subtype;
	}

	public void setSubtype(PermissionSubtype subtype) {
		this.subtype = subtype;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
