@ALL

Feature: check 1
  Scenario: i open hillel
    When I open page "https://dnipro.ithillel.ua/"
    Then check1
      | element    | text             | result |
      | school     | школа            | true   |
      | courses    | курси            | true   |
      | employment | працевлаштування | true   |
      | blog       | блог             | true   |
      | contacts   | контакти         | true   |

