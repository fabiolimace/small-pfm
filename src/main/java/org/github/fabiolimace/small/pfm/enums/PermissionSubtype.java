package org.github.fabiolimace.small.pfm.enums;

public enum PermissionSubtype {

	BOOK('B'), ACCOUNT('A'), RESOURCE('R');

	private char value;

	PermissionSubtype(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
