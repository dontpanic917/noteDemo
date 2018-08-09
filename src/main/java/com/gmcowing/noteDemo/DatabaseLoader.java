package com.gmcowing.noteDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final NoteRepository repository;

	@Autowired
	public DatabaseLoader(NoteRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Note("buy groceries", "1 carrot, 2 eggs, 3 flour, 4 chicken"));
	}
}
