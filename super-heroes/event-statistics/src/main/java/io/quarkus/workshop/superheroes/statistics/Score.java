package io.quarkus.workshop.superheroes.statistics;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Score {
	protected String name;
	protected int score;

	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public Score() {
	}

	// Getters, Setters and toString
}