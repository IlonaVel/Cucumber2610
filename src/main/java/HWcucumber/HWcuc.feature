@ALL

Feature: check 1
  Scenario Outline: i open hillel
    When I open the page "https://dnipro.ithillel.ua/"
    Then Check "<Element>" with "<Text>"
    Examples:
      | element    | text             |  |
      | school     | школа            |  |
      | courses    | курси            |  |
      | employment | працевлаштування |  |
      | blog       | блог             |  |
      | contacts   | контакти         |  |

