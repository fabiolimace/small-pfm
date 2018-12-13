package org.github.fabiolimace.small.pfm.enums;

public enum AccountType {

	ASSET('A'), LIABILITY('L'), EXPENSE('E'), INCOME('I'), CAPITAL('C');

	private char value;

	AccountType(char value) {
		this.value = value;
	}

	public char getType() {
		return value;
	}

	public void setType(char value) {
		this.value = value;
	}
}
