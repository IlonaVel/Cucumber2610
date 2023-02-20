@ALL
Feature: check cer

 # Scenario Outline: scheck
  #  When I open page "https://certificate.ithillel.ua/"
  #  And cent cerNumber "<NUMBER>" "<RESULT>"
 #   Examples:
  #    | NUMBER   | RESULT |
 #     | 45924126 | true   |
 #    | 4566666  | false  |

    Scenario: open consultation form
      When I open page "https://dnipro.ithillel.ua/"

      When click button consultation
      Then Check open consultation "Запит на консультацію"

      Scenario: work with table
        When Create quary
          | name    | mail              | telephone |
          | vasiliy | vasiok@gmail.com  | 123456789 |
          | Nikolay | somemail@mail.com | 987654321 |
          | Vitaliy | hdhdh@hhh.com     | 987456123 |

 # Scenario: list maps
 #   When soutlistMAps
 #     | name    | mail              | telephone |
 #         | vasiliy | vasiok@gmail.com  | 123456789 |
 #         | Nikolay | somemail@mail.com | 987654321 |
 #         | Vitaliy | hdhdh@hhh.com     | 987456123 |