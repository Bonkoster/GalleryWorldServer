package com.lukashman.model.non.persistance;

import java.time.LocalDate;

import com.lukashman.model.User;

public class Message {
	
	private User author;
	
	private LocalDate date;
	
	private String text;

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
