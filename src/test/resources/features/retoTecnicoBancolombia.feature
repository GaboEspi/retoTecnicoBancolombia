#autor: gabriel espitia genes
  @stories
  Feature: Reto Tecnico bncolombia
    As a user, i want to automate teh creation of an usr om utest.com
  @scenario1
#  Scenario: signup on the site utest
#    Given than Gabriel want to create a user
#    When he type his personal data on the utest platform signUp step one
#    When he type his address data on the utest platform signUp step two
#    When he type his devices data on the utest platform signUp step tree
#    When he type his security acces data on the utest platform signUp step four
#    Then he finally create a user on the utest platform
    Scenario: signup on the site utest
      Given than Gabriel want to create a user
      When he type his personal data on the utest platform signUp step one
        |strFirstName|strLastName|strEmail|strMonth|strDay|strYear|
        | gabriel jaime | espitia genes | gaes@hotm.com | May | 5 | 1993 |
      When he type his address data on the utest platform signUp step two
        |strPostalCode|
        |230550|
      When he type his devices data on the utest platform signUp step tree
        |strComputer|strVersion|strLanguage|strMobile|strModel|strOp|
        |Windows|2000|Spanish|Xiaomi|Redmi Note 9s|Android 10|
      When he type his security acces data on the utest platform signUp step four
        |strPassword|
        |Gab34*.**$%gb|
      Then he finally create a user on the utest platform
        |strWelcome|
        |Welcome to the world's largest community of freelance software testers!|