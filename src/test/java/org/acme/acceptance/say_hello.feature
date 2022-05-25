@api
Feature: Say Hello

    API should say hello when requested

    Scenario: Hello
        Given user is available
        When user says "hello"
        Then the response should be "Hello from RESTEasy Reactive"

