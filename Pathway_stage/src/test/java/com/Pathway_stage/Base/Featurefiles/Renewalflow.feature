Feature: check the  functionality of renewal a sigal with Pathway tool

@tag1
Scenario: Rise a Renewal request with Market user

Given Enter Url of application into the "chrome" browsern for Renewal process
When Market user loginwith valid credtinals for Renewal process
Then Rise a Renewal  request with Marketuser 429
Then Logout MarketUser after rise a request for  Renewal process
@tag2
Scenario: Check the status of Renewal Request with MDU user

When MDU user login with valid credtinals for Renewal process
Then MDU user "Approved" Renewal signal with 429
Then Logout MDU user after check the status of Renewal request

@tag3
Scenario: Check the staus of the Renewal Request with MO user

When MO user login with valid credtinals for Renewal process
Then MO user "Approved" Renewal Signal with 429
Then Logout MO user after check the status of Renewal request

@tag4

Scenario: Check the status of the Renewal Request with RPM user

When RPM user login with Valid credtinals for Renewal process
Then RPM user "Approved" Renewal signal with 429
Then Logout RPM user after suucesful check the status of Renewal Process

@tag5

Scenario: Check the status of the Renewal Request with NOC user

When NOC user login with Valid credtinals for Renewal process
Then NOC user "Approved" Renewal signal with 429
Then Logout NOC user after suucesful check the status of Renewal Process

@tag6
Scenario: Check the status of the Renewal Request Legal user
When LEGAL user login with valid credtinals for Renewal Process
Then Request send to FCC with Legal user FOR Renewal PROCESS with 429
Then Logout LEGAL user after succesful Renewal Request Send to FCC