package org.github.fabiolimace.small.pfm.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.github.fabiolimace.small.pfm.enums.AttachmentType;

public class Attachment {

	protected UUID id;
	protected AttachmentType type;
	protected LocalDateTime date;
	protected String name;
	protected String description;
	protected boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public AttachmentType getType() {
		return type;
	}

	public void setType(AttachmentType type) {
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
