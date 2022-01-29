Feature: Home Page   
  
  Scenario: User verify currency values change
  
    When User click on currency
    And User chose Euro from dropdown
    Then currency values change to euro
    

  Scenario: User empty Shooping cart message displays
  When User click on shopping cart
  Then "your shopping cart is empty!" message should be displayed
