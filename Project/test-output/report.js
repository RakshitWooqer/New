$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/stepDefination/Feature_file/Login.feature");
formatter.feature({
  "name": "Tuto",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User navigates to Tuto",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on tuto homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_steps.goToTuto()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tuto"
    }
  ]
});
formatter.step({
  "name": "User enters the username",
  "keyword": "When "
});
formatter.match({
  "location": "Login_steps.clickusername()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.enterpassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the signin button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify the homepage tittle to check whether login is working or not",
  "keyword": "And "
});
formatter.match({
  "location": "Login_steps.homepage()"
});
formatter.result({
  "status": "passed"
});
});