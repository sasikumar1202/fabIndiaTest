$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\fabindia.feature");
formatter.feature({
  "name": "FabIndia Application Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fp"
    }
  ]
});
formatter.step({
  "name": "user should navigate to the application",
  "keyword": "Given "
});
formatter.step({
  "name": "user should move to login dropdown and click Log-in",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the Email Radio Button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the username \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the passkey \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "velusasi.1202@gmail.com",
        "ruby30@K"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login details",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@fp"
    }
  ]
});
formatter.step({
  "name": "user should navigate to the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_Page_Step_Definition.userShouldNavigateToTheApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should move to login dropdown and click Log-in",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page_Step_Definition.userShouldMoveToLoginDropdownAndClickLogIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the Email Radio Button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page_Step_Definition.userShouldClickTheEmailRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the username \"velusasi.1202@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page_Step_Definition.userShouldEnterTheUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the passkey \"ruby30@K\"",
  "keyword": "And "
});
formatter.match({
  "location": "Login_Page_Step_Definition.userShouldEnterThePasskey(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Page_Step_Definition.userShouldClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Kids Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@kp"
    }
  ]
});
formatter.step({
  "name": "user should click the kids section",
  "keyword": "Given "
});
formatter.step({
  "name": "user should click the boys ethnic wear section in the below dropdown",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the size and select",
  "keyword": "And "
});
formatter.step({
  "name": "user should click the category and select \"\u003cdress\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "dress"
      ]
    },
    {
      "cells": [
        "Kurta Sets"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Kids Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@kp"
    }
  ]
});
formatter.step({
  "name": "user should click the kids section",
  "keyword": "Given "
});
formatter.match({
  "location": "Kids_Page_Step_Definition.userShouldClickTheKidsSection()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the boys ethnic wear section in the below dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Kids_Page_Step_Definition.userShouldClickTheBoysEthnicWearSectionInTheBelowDropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the size and select",
  "keyword": "And "
});
formatter.match({
  "location": "Kids_Page_Step_Definition.userShouldClickTheSizeAndSelect()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the category and select \"Kurta Sets\"",
  "keyword": "And "
});
formatter.match({
  "location": "Kids_Page_Step_Definition.userShouldClickTheCategoryAndSelect(String)"
});
formatter.result({
  "status": "passed"
});
});