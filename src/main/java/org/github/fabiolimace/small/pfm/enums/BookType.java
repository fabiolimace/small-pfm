package org.github.fabiolimace.small.pfm.enums;

public enum BookType {

	SINGLE_ENTRY('S'), DOUBLE_ENTRY('D');

	private char value;

	BookType(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}
}
