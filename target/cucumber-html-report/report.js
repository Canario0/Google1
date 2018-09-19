$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Google search",
  "description": "  \u0027When I go to google search page and i search for a cucumber.\n  I expect to get 1 or more links.\u0027",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search cucumber",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "That I have enter to the Google search page",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepsDefinitions.enterGoogleSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"cucumber\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepsDefinitions.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get more than 1 link",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepsDefinitions.iShouldGetMoreThanOneLink()"
});
formatter.result({
  "status": "passed"
});
});