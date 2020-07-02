$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/itexps/features/acku.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#----------------------------------"
    },
    {
      "line": 2,
      "value": "# Empty Cucumber .feature file"
    },
    {
      "line": 3,
      "value": "#----------------------------------"
    }
  ],
  "line": 7,
  "name": "Validate IBG Catering Web App Test",
  "description": "",
  "id": "validate-ibg-catering-web-app-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Check Catering Web Page Features",
  "description": "",
  "id": "validate-ibg-catering-web-app-test;check-catering-web-page-features",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user is on catering homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "user enter name and email",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter phone no. and comment",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click location",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user enter captcha and submit",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user closes web app",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_on_catering_homepage()"
});
formatter.result({
  "duration": 14425075500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_name_and_email()"
});
formatter.result({
  "duration": 8470399800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_phone_no_and_comment()"
});
formatter.result({
  "duration": 54000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_location()"
});
formatter.result({
  "duration": 60500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_captcha_and_submit()"
});
formatter.result({
  "duration": 44100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_closes_web_app()"
});
formatter.result({
  "duration": 49400,
  "status": "passed"
});
});