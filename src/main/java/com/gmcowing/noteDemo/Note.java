package com.gmcowing.noteDemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Note {

	private @Id @GeneratedValue Long id;
	private String title;
	private String text;

	private Note() {}

	public Note(String firstName, String lastName) {
		this.title = firstName;
		this.text = lastName;
	}
}
