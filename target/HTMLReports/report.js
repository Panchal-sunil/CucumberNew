$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Validating Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successful with valid cridencials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open crome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_open_crome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage.user_enter_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user naviagte home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.user_naviagte_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPage.user_click_on_logout_button()"
});
formatter.result({
  "status": "passed"
});
});