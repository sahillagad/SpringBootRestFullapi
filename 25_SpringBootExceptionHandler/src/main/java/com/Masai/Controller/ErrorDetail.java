package com.Masai.Controller;

import java.time.LocalDate;
import java.time.LocalTime;

public class ErrorDetail {

	private LocalDate date;
	private LocalTime time;
	private String description;
	private String uri;
	public ErrorDetail(LocalDate date, LocalTime time, String description, String uri) {
		super();
		this.date = date;
		this.time = time;
		this.description = description;
		this.uri = uri;
	}
	public ErrorDetail() {
		super();
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "ErrorDetail [date=" + date + ", time=" + time + ", description=" + description + ", uri=" + uri + "]";
	}
	
	
	
}
