package org.github.fabiolimace.small.pfm.enums;

public enum Role {

	ADMIN('A'), MANAGER('M'), USER('U'), GUEST('G');

	private char value;

	Role(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
