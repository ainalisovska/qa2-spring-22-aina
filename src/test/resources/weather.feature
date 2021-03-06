Feature: Testing Weather API

  Scenario: Checking weather for the city
    Given city id: 524901

    When we are requesting weather data

    Then coords are:
      | lon | 145.77 |
      | lat | -16.92 |

    And weather is:
      | id          | 802              |
      | main        | Clound           |
      | description | scattered clouds |
      | icon        | 03n              |
    And base is "stations"