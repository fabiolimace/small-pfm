package org.github.fabiolimace.small.pfm.enums;

public enum PermissionType {

	ROLE('R'), USER('U');

	private char value;

	PermissionType(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
