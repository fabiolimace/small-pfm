package org.github.fabiolimace.small.pfm.enums;

public enum Operation {

	CREATE('C'), READ('R'), UPDATE('U'), DELETE('D');

	private char value;

	Operation(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
