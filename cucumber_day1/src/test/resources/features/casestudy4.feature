Feature: searching product

  Scenario Outline: tests for searching product
  * user open the testme application
   * user clicks on Signin
  * user enters UserName "<userName>"
   * user enters password "<pwd>"
    * user click on Login button
    * user click on all categories
    * user click on electronics
    * user click on headphones
    * user enter "carry" in search bar
  * user click on add to cart
  
  Examples:
  |userName|pwd|
  |Lalitha|Password123|