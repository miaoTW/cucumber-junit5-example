/*
 * Copyright © 2023 IBM Corporation. IBM retains ownership, copyrights, any title of this source code. IBM Confidential.
 */
package com.example.service;

import com.example.repository.StationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class StationService {

  private final StationRepository repo;
  
  public void create() {
    log.info("service : station create");
    repo.create();
  }
}
