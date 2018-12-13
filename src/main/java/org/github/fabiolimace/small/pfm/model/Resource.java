package org.github.fabiolimace.small.pfm.model;

import java.util.UUID;

public class Resource {

	protected UUID id;
	protected String name;
	protected boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
