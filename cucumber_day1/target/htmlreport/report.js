$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/myfeature_2.feature");
formatter.feature({
  "name": "TestmeApp",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "searching the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@payment"
    }
  ]
});
formatter.step({
  "name": "user do the payment",
  "keyword": "* "
});
formatter.match({
  "location": "testcase_2.user_do_the_payment()"
});
formatter.result({
  "status": "passed"
});
});