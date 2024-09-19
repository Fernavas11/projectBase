Feature: open a web page


  @successful
  Scenario: open a web page with the edge browser

    Given "user" opens testing website
    When enter the edge browser
    Then display the title of the web page "cucumber"