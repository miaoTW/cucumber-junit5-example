Feature: Awesome Feature

  @awesome @disabled
  Scenario: You can re-use existing steps
    Given something exists
    When something is executed
    Then some result will be calculated

  @awesome @disabled
  Scenario: and even change the leading keyword
    * something exists
    * something is executed
    * some result will be calculated

  @awesome @failure @disabled
  Scenario: Failures should be made visible in a human readable report
    * something exists
    * something is executed
    * no result can be calculated

 	@awesome @noResult @disabled
  Scenario: no result can be calculated
    * something else exists
    * something else is executed
    * no result can be calculated