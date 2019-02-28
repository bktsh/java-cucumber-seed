@Working
Feature: Search phrases on google home page

  Scenario Outline: Searching phrases
    Given I am on google homepage
    When I search <phrase>
    Then I should see <result>

    Examples:
      | phrase                                    | result                                    |
      | Abercrombie and Fitch home office address | 6301 Fitch Path, New Albany, OH 43054     |
      | Hashem Baktash                            | https://www.linkedin.com/in/hashembaktash |


  Scenario Outline: Searching phrases extended
    Given I am on google homepage
      And I search <phrase>
     When I should see <result>
     Then I am good

    Examples:
      | phrase                                    | result                                    |
      | Abercrombie and Fitch home office address | 6301 Fitch Path, New Albany, OH 43054     |
      | Hashem Baktash                            | https://www.linkedin.com/in/hashembaktash |
