package com.example.steps;

import org.mockito.Mock;

import com.example.repository.StationRepository;
import com.example.service.StationService;
import com.example.state.ScenarioState;

import io.cucumber.java.en.Given;

/**
 * Setup steps that initialize the currently active example/scenario state to a
 * certain value.
 */
public class SetupSteps {

	StationService service;
	@Mock
	StationRepository repo;

	private final ScenarioState state;

	public SetupSteps(final ScenarioState state) {
		this.state = state;
	}

	@Given("something exists")
	public void something() {
		state.setUserInput("123");
	}

	@Given("something else exists")
	public void somethingElse() {
		state.setUserInput("abc");
	}

}
