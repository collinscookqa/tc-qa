@run
Feature: New User Registration
#As a customer
#I want to input my user details
#So i can access MyAccount Page

Scenario Outline: Valid data entered
Given The user is on Frog Home Page
When The user enters <Email_Address> in Email Address text field
And  user enters <Password> in Password text field
And  clicks on the "Let's Go" button
Then User should see MYACCOUNT Page

Examples:
      | Email_Address | Password | 
      | "test@test.com"  | "test1"  |        
      | "test2@test.com" | "test2"  |  
     