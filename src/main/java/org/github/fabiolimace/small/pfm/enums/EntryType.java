package org.github.fabiolimace.small.pfm.enums;

public enum EntryType {
	
	DEBIT('D'), CREDIT('C');

	private char value;

	EntryType(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}
}
