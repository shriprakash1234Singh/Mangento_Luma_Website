Feature: Verify Sign In Functionality


Scenario: Verify user successfully sign in with valid data 

Given user launch browser and navigate to home page with url as "https://magento.softwaretestingboard.com/"
When  user click on sign in link
And   user enter valid username and password in filed
		  | EmailFiled            | Password  |
			|shriprakas99@gmail.com | @chotu99  |
And   click on sign in button
Then  verify that user is successfully sign in in account