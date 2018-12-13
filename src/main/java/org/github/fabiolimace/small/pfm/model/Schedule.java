package org.github.fabiolimace.small.pfm.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.github.fabiolimace.small.pfm.enums.ScheduleType;

public class Schedule {

	protected UUID id;
	protected ScheduleType type;
	protected String name;
	protected Transaction transaction; // template
	protected LocalDateTime start;
	protected LocalDateTime end;
	protected LocalDateTime occurencies;
	protected String expression; // examples: "1,15", "20-25", "*/2" etc
	protected boolean automatic; // automatic, otherwise only remind
	protected boolean weekend; // include weekend
	protected boolean active;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public ScheduleType getType() {
		return type;
	}

	public void setType(ScheduleType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public boolean isWeekend() {
		return weekend;
	}

	public void setWeekend(boolean weekend) {
		this.weekend = weekend;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
