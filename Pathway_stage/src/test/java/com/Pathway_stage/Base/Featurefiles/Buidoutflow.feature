Feature: Check the buildoutflow functionality with Pathway tool

@tag1
Scenario: Rise a Buildout request with Market user

Given Enter Url of application into the "chrome" browser for BUildOutrequest
Given Enter Url of application into the "chrome" browser for BUildOutrequest
When Market user loginwith valid credtinals for BUildOutrequest process
Then Rise a BUildOut request with Marketuser 488 with date "06-09-2020"
Then Logout MarketUser after rise a request for  BUildOut 

@tag2
Scenario: Check the status of BUildOut Request with RPM user

When RPM user login with valid credtinals for BUildOut process
Then RPM user "Approved" BUildOut request signal with 488
Then Logout RPM user after check the status of BUildOut request

@tag3
Scenario: Check the staus of the BUildOutrequest  with NOC user

When NOC user login with valid credtinals for BUildOutrequest process
Then NOC user "Approved" BUildOutrequest Signal with 488
Then Logout NOC user after check the status of BUildOutrequest 

@tag4
Scenario: Check the status of the BUildOutrequest Legal user
When LEGAL user login with valid credtinals for BUildOutrequest
Then Request send to FCC with Legal user FOR BUildOutrequest with 488
Then Logout LEGAL user after succesful BUildOutrequest Send to FCC

