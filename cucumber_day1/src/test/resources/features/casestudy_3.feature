Feature: search product

  Scenario Outline: test for searching product
  * user open the test me application
   * user click on Signin
  * user enter Username "<userName>"
   * user enter password "<pwd>"
    * user clicks on login button
    * user clicks on all categories
    * user clicks on electronics
    * user clicks on headphones
    * user enters "head" in search bar
  * user clicks on add to cart
  * user clicks on cart
  * user clicks on checkout
  Examples:
  |userName|pwd|
  |Lalitha|Password123|
