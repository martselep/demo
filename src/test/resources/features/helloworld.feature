Feature: Hello World Test

  Scenario: hello world test
    Given a name
    When I call the hello world service
    Then it should return with greeting the given name