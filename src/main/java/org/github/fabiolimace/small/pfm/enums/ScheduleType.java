package org.github.fabiolimace.small.pfm.enums;

public enum ScheduleType {

	ONCE('O'), DAILY('D'), WEEKLY('W'), MONTHLY('M'), YEARLY('Y');

	private char value;

	ScheduleType(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

}
