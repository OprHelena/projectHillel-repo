===============TAF_SETUP=============== Read Confluence:

===============RUNTIME_PROPERTIES_TO_BE_SET===============

env.property.path - path to env properties file: path should be from TAF reference;
selenide.headles - if we want to run tests in headless mode: could be true of false
cucumber.options - if want to specify feature file, scenario or tag to be run
===============REPORTING=============== This TAF used Allure as reporting tool

To generate report following commands should be used:

mvn allure:serve - generate html report and open it in browser
mvn allure:report - generate html report NOTE: report generation should be done after test/suite execution Report location: target/site/allure-maven-plugin/index.html
