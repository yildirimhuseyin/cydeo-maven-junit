Feature: Google search functionality
  Agile story: As a user , when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google



  Scenario Search functionality result title verification:
  Given User is on Google search page
  Then  User types apple in the google search box and clicks enter
  Then User sees Steve Jobs is in the google title


    #This is the way how we add comment in feature file