
Feature: facebook login validation

Scenario Outline: facebook login valid username and invalid password
	Given launch facebook page
	Then Check application is launched
	When Enter <username> and <password>
		And click login button
	Then Check error is occured	
	
	Examples:
	|username|password|
	|abc|abc@123|
  |bcd|chu@123|
  |fcd|chu@923|
 
 