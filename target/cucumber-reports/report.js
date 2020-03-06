$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Prince/IdeaProjects/CodersGuruTests/src/test/java/codersguru/cucumber/BookMentor.feature");
formatter.feature({
  "line": 1,
  "name": "Book mentor",
  "description": "",
  "id": "book-mentor",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Book mentor",
  "description": "",
  "id": "book-mentor;book-mentor",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open site codersguru",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on register new user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I register private user with \"\u003cemail\u003e\" \"\u003cname\u003e\" \"\u003csurname\u003e\" \"\u003cpass\u003e\" \"\u003ccity\u003e\" \"\u003ccode\u003e\" \"\u003cstreet\u003e\" \"\u003cnumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully registered",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I select \"GIT\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select mentor 3",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select first date and hour possible with message \"I need help!\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I\u0027m redirected to PayU site",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter fake credit card details",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Payment is refused",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "book-mentor;book-mentor;",
  "rows": [
    {
      "cells": [
        "email",
        "name",
        "surname",
        "pass",
        "city",
        "code",
        "street",
        "number"
      ],
      "line": 17,
      "id": "book-mentor;book-mentor;;1"
    },
    {
      "cells": [
        "@kordecki.pl",
        "Krzysztof",
        "Kordecki",
        "pass1!@#",
        "Wroclaw",
        "52-129",
        "Kielbasnicza",
        "28"
      ],
      "line": 18,
      "id": "book-mentor;book-mentor;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8998094700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Book mentor",
  "description": "",
  "id": "book-mentor;book-mentor;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open site codersguru",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on register new user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I register private user with \"@kordecki.pl\" \"Krzysztof\" \"Kordecki\" \"pass1!@#\" \"Wroclaw\" \"52-129\" \"Kielbasnicza\" \"28\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully registered",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I select \"GIT\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I select mentor 3",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select first date and hour possible with message \"I need help!\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I\u0027m redirected to PayU site",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter fake credit card details",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Payment is refused",
  "keyword": "Then "
});
formatter.match({
  "location": "registerUserSteps.iOpenSiteCodersguru()"
});
formatter.result({
  "duration": 2902848300,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.iClickOnRegisterNewUser()"
});
formatter.result({
  "duration": 1169723100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@kordecki.pl",
      "offset": 30
    },
    {
      "val": "Krzysztof",
      "offset": 45
    },
    {
      "val": "Kordecki",
      "offset": 57
    },
    {
      "val": "pass1!@#",
      "offset": 68
    },
    {
      "val": "Wroclaw",
      "offset": 79
    },
    {
      "val": "52-129",
      "offset": 89
    },
    {
      "val": "Kielbasnicza",
      "offset": 98
    },
    {
      "val": "28",
      "offset": 113
    }
  ],
  "location": "registerUserSteps.iRegisterPrivateUserWith(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 4166279700,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.userShouldBeSuccessfullyRegistered()"
});
formatter.result({
  "duration": 58104700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GIT",
      "offset": 10
    }
  ],
  "location": "BookMentorSteps.iSelect(String)"
});
formatter.result({
  "duration": 1792632300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 16
    }
  ],
  "location": "BookMentorSteps.iSelectMentor(int)"
});
formatter.result({
  "duration": 5321293000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I need help!",
      "offset": 52
    }
  ],
  "location": "BookMentorSteps.iSelectFirstDateAndHourPossibleWithMessage(String)"
});
formatter.result({
  "duration": 1433547400,
  "status": "passed"
});
formatter.match({
  "location": "BookMentorSteps.iMRedirectedToPayUSite()"
});
formatter.result({
  "duration": 1891881300,
  "status": "passed"
});
formatter.match({
  "location": "BookMentorSteps.iEnterFakeCreditCardDetails()"
});
formatter.result({
  "duration": 3573156000,
  "status": "passed"
});
formatter.match({
  "location": "BookMentorSteps.paymentIsRefused()"
});
formatter.result({
  "duration": 51306700,
  "status": "passed"
});
formatter.after({
  "duration": 8853522700,
  "status": "passed"
});
formatter.uri("C:/Users/Prince/IdeaProjects/CodersGuruTests/src/test/java/codersguru/cucumber/RegisterUser.feature");
formatter.feature({
  "line": 1,
  "name": "Register user",
  "description": "",
  "id": "register-user",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Register private user",
  "description": "",
  "id": "register-user;register-private-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open site codersguru",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on register new user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I register private user with \"\u003cemail\u003e\" \"\u003cname\u003e\" \"\u003csurname\u003e\" \"\u003cpass\u003e\" \"\u003ccity\u003e\" \"\u003ccode\u003e\" \"\u003cstreet\u003e\" \"\u003cnumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully registered",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "register-user;register-private-user;",
  "rows": [
    {
      "cells": [
        "email",
        "name",
        "surname",
        "pass",
        "city",
        "code",
        "street",
        "number"
      ],
      "line": 10,
      "id": "register-user;register-private-user;;1"
    },
    {
      "cells": [
        "@kordecki.pl",
        "Krzysztof",
        "Kordecki",
        "pass1!@#",
        "Wroclaw",
        "52-129",
        "Kielbasnicza",
        "28"
      ],
      "line": 11,
      "id": "register-user;register-private-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8691354200,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Register private user",
  "description": "",
  "id": "register-user;register-private-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I open site codersguru",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on register new user",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I register private user with \"@kordecki.pl\" \"Krzysztof\" \"Kordecki\" \"pass1!@#\" \"Wroclaw\" \"52-129\" \"Kielbasnicza\" \"28\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should be successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "registerUserSteps.iOpenSiteCodersguru()"
});
formatter.result({
  "duration": 1764662900,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.iClickOnRegisterNewUser()"
});
formatter.result({
  "duration": 1246627100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@kordecki.pl",
      "offset": 30
    },
    {
      "val": "Krzysztof",
      "offset": 45
    },
    {
      "val": "Kordecki",
      "offset": 57
    },
    {
      "val": "pass1!@#",
      "offset": 68
    },
    {
      "val": "Wroclaw",
      "offset": 79
    },
    {
      "val": "52-129",
      "offset": 89
    },
    {
      "val": "Kielbasnicza",
      "offset": 98
    },
    {
      "val": "28",
      "offset": 113
    }
  ],
  "location": "registerUserSteps.iRegisterPrivateUserWith(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3608560800,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.userShouldBeSuccessfullyRegistered()"
});
formatter.result({
  "duration": 61921600,
  "status": "passed"
});
formatter.after({
  "duration": 13622460400,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Register company user",
  "description": "",
  "id": "register-user;register-company-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I open site codersguru",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on register new user",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on button \u0027Firma\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I register company user with \"\u003cemail\u003e\" \"\u003cname\u003e\" \"\u003csurname\u003e\" \"\u003cpass\u003e\" \"\u003ccity\u003e\" \"\u003ccode\u003e\" \"\u003cstreet\u003e\" \"\u003cnumber\u003e\" \"\u003ccompany\u003e\" \u0027NIP\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be successfully registered",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "register-user;register-company-user;",
  "rows": [
    {
      "cells": [
        "email",
        "name",
        "surname",
        "pass",
        "city",
        "code",
        "street",
        "number",
        "company"
      ],
      "line": 21,
      "id": "register-user;register-company-user;;1"
    },
    {
      "cells": [
        "@kordecki.pl",
        "Krzysztof",
        "Kordecki",
        "pass1!@#",
        "Wroclaw",
        "52-129",
        "Kielbasnicza",
        "28",
        "Kross"
      ],
      "line": 22,
      "id": "register-user;register-company-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8637587700,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Register company user",
  "description": "",
  "id": "register-user;register-company-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I open site codersguru",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on register new user",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on button \u0027Firma\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I register company user with \"@kordecki.pl\" \"Krzysztof\" \"Kordecki\" \"pass1!@#\" \"Wroclaw\" \"52-129\" \"Kielbasnicza\" \"28\" \"Kross\" \u0027NIP\u0027",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should be successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "registerUserSteps.iOpenSiteCodersguru()"
});
formatter.result({
  "duration": 1801559100,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.iClickOnRegisterNewUser()"
});
formatter.result({
  "duration": 1117534000,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.iClickOnButtonFirma()"
});
formatter.result({
  "duration": 314510800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "@kordecki.pl",
      "offset": 30
    },
    {
      "val": "Krzysztof",
      "offset": 45
    },
    {
      "val": "Kordecki",
      "offset": 57
    },
    {
      "val": "pass1!@#",
      "offset": 68
    },
    {
      "val": "Wroclaw",
      "offset": 79
    },
    {
      "val": "52-129",
      "offset": 89
    },
    {
      "val": "Kielbasnicza",
      "offset": 98
    },
    {
      "val": "28",
      "offset": 113
    },
    {
      "val": "Kross",
      "offset": 118
    }
  ],
  "location": "registerUserSteps.iRegisterCompanyUserWithNIP(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 20183421700,
  "status": "passed"
});
formatter.match({
  "location": "registerUserSteps.userShouldBeSuccessfullyRegistered()"
});
formatter.result({
  "duration": 66025500,
  "status": "passed"
});
formatter.after({
  "duration": 3583482100,
  "status": "passed"
});
});