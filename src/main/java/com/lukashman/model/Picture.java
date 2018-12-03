package com.lukashman.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.lukashman.model.converter.LocalDateAttributeConverter;

@Entity
@Table ( name = "picture_table" )
@Component
public class Picture {
	
	@Id
	@Column ( name = "picture_id" )
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn ( name = "picture_author_id", referencedColumnName = "user_id" )
	private User author;
	
	@Column ( name = "picture_date" )
	@Convert ( converter = LocalDateAttributeConverter.class )
	private LocalDate date;
	
	@Column ( name = "picture_text" )
	private String text;
	
	@Column ( name = "picture_context" )
	private byte[] content;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

}
