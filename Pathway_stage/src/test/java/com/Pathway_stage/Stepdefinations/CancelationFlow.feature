Feature: check the Functionlaity of  signal Cancelation flow of the pathway tool

@tag1
Scenario: Rise a cancelation request with Market user

Given Enter Url of application into the "chrome" browser
When Market user loginwith valid credtinals for Cancelation process
Then Rise a Cancelation request with Marketuser 431
Then Logout MarketUser after rise a request for  Cancelation 


@tag2
Scenario: Check the status of Cancelation Request with RPM user

When RPM user login with valid credtinals for Cancelation process
Then RPM user "Approved" Cancelation signal with 431
Then Logout RPM user after check the status of cancelation request

@tag3
Scenario: Check the staus of the Cancelation Request with RRM user

When RRM user login with valid credtinals for Cancelation process
Then RRM user "Approved" Cancelation Signal with 431
Then Logout RRM user after check the status of cancelation request

@tag4

Scenario: Check the status of the Cancelation Request with NOC user

When NOC user login with Vlaid credtinals for Cancletaion process
Then NOC user "Approved" Cancelation signal with 431
Then Logout NOC user after suucesful check the status of Cancelation Process

@tag5
Scenario: Check the status of the Cancelation Request Legal user
When LEGAL user login with valid credtinals for Cancelation Process
Then Request send to FCC with Legal user with 431
Then Logout LEGAL user after succesful Cancelation Request Send to FCC

