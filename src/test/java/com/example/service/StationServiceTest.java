/*
 * Copyright © 2023 IBM Corporation. IBM retains ownership, copyrights, any title of this source code. IBM Confidential.
 */
package com.example.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.repository.StationRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StationServiceTest {

	StationService service;
	@Mock
	StationRepository repo;

	@BeforeAll
	@Given("create station mock data")
	public void setUpBeforeClass() throws Exception {
		MockitoAnnotations.openMocks(this);

		service = new StationService(repo);
		doNothing().when(repo).create();

	}

	@Test
	@When("station is created")
	public void testCreate() {
		service.create();
		verify(repo, times(1)).create();
	}

	@Then("station repo save result can be calculated")
	public void verifyResult() {
		verify(repo, times(1)).create();
	}

}
