#Feature: Verify Create Account Functionality
#
#Scenario: Verify user successfully create account with valid data 
#
#Given user launch browser and navigate to home page with url as "https://magento.softwaretestingboard.com/"
#When  user click on create an account link
#And   user enter valid information in filed
#		  | FirstName   | LastName |     EmailFiled        | Password  | ConfirmPassword| 
#			| ShriPrakash | Singh    |shriprakas99@gmail.com | @chotu99  | @chotu99       |
#And   click on create an account button
#Then  verify that user is successfully created an account