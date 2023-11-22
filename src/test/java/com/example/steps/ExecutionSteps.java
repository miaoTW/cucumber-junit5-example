/*
 * Copyright © 2023 IBM Corporation. IBM retains ownership, copyrights, any title of this source code. IBM Confidential.
 */
package com.example.steps;

import com.example.state.ScenarioState;

import io.cucumber.java.en.When;

/**
 * State modifying steps. They act on the currently active example/scenario
 * state which is inject into an instance of this class per example/scenario.
 */
public class ExecutionSteps {


	private final ScenarioState state;

	public ExecutionSteps(final ScenarioState state) {
		this.state = state;
	}

	@When("something is executed")
	public void execute() {
		final var userInput = state.getUserInput();
		final var result = Integer.parseInt(userInput);
		state.setResult(result);
	}

	@When("something else is executed")
	public void executeElse() {
		final var result = 0;
		state.setResult(result);
	}


}
