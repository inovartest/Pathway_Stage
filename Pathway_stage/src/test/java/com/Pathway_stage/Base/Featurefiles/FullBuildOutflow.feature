Feature: check the all functions of BuildOutflow flow for all users

@Marketuser1
Scenario: Rise a BuildOutflow Request with First Market User

Given enter url application into "chrome" for full BuildOutflow flow with "stage"
When  First Market User login with valid creditinals for full BuildOutflow process with "stage"
Then Rise a BuildOutflow Request with  First Market User 3016 with "06-18-2020"
Then logout  First MarketUser after rise a full BuildOutflow process

@RPMuser1
Scenario: Check the status of the BuildOutflow apllication for with First RPM User

When First RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with First RPM User 3019
Then logout First RPM User after rise a full BuildOutflow process

@NOCuser1
Scenario: Check the status of the BuildOutflow apllication for with First NOC User

When First NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  First NOC User 3019
Then logout First NOC User after rise a full BuildOutflow process

@LegalUser1
Scenario: Check the status of the BuildOutflow apllication for with First Legal User

When First Legal User login with valid creditinals for full BuildOutflow process
Then Request send to FCC of BuildOutflow Request with  First Legal User 3019
Then logout First Legal User after rise a full BuildOutflow process

 @MarketUser2
 Scenario: Rise a BuildOutflow Request with Second Market User

When Second Market User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with secondMarket User 2719 with "06-18-2020"
Then logout Second MarketUser after rise a full BuildOutflow process

@RPMuser2
Scenario: Check the status of the BuildOutflow apllication for with Second RPM User

When Second RPM User login with valid creditinals for full BuildOutflow process
Then check the "Rejeted" status a BuildOutflow Request with Second RPM User 2719
Then logout RPM Second User after rise a full BuildOutflow process


 @MarketUser3
 Scenario: Rise a BuildOutflow Request with Third Market User

When Third Market User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  Third Market User 2722 with "06-18-2020"
Then logout  Third MarketUser after rise a full BuildOutflow process

@RPMuser3
Scenario: Check the status of the BuildOutflow apllication for with Third RPM User

When Third RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with Third RPM User 2722
Then logout Third RPM User after rise a full BuildOutflow process

@NOCuser3
Scenario: Check the status of the BuildOutflow apllication for with Third NOC User

When Third NOC User login with valid creditinals for full BuildOutflow process
Then check the "Rejected" status a BuildOutflow Request with  Third NOC User 2722
Then logout  Third NOC User after rise a full BuildOutflow process

@MarketUser4
 Scenario: Rise a BuildOutflow Request with fourth Market User

When fourth Market User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  fourth Market User 2724 with "06-18-2020"
Then logout  fourth MarketUser after rise a full BuildOutflow process

@RPMuser4
Scenario: Check the status of the BuildOutflow apllication for with fourth RPM User

When fourth RPM User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with fourth RPM User 2724
Then logout fourth RPM User after rise a full BuildOutflow process

@NOCuser4
Scenario: Check the status of the BuildOutflow apllication for with fourth NOC User

When fourth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  fourth NOC User 2724
Then logout  fourth NOC User after rise a full BuildOutflow process

@RPMUSER5
Scenario: Rise a BuildOutflow Request with fifth RPM User

When fifth RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  fifth RPM User 2705 with "06-18-2020"
Then logout  fifth RPM User after rise a full BuildOutflow process

@NOCuser5
Scenario: Check the status of the BuildOutflow apllication for with Fifth NOC User

When fifth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  fifth NOC User 2705
Then logout  fifth NOC User after rise a full BuildOutflow process

@LegalUser5
Scenario: Check the status of the BuildOutflow apllication for with fifth Legal User

When fifth Legal User login with valid creditinals for full BuildOutflow process
Then Request send to FCC of BuildOutflow Request with  fifth Legal User 2705
Then logout fifth Legal User after rise a full BuildOutflow process

@RPMUSER6
Scenario: Rise a BuildOutflow Request with sixth RPM User

When sixth RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  sixth RPM User 2706 with "06-18-2020"
Then logout  sixth RPM User after rise a full BuildOutflow process

@NOCuser6
Scenario: Check the status of the BuildOutflow apllication for with sixth NOC User

When sixth NOC User login with valid creditinals for full BuildOutflow process
Then check the "Rejcted" status a BuildOutflow Request with  sixth NOC User 2706
Then logout  sixth NOC User after rise a full BuildOutflow process

@RPMUSER7
Scenario: Rise a BuildOutflow Request with seventh RPM User

When seventh RPM User login with valid creditinals for full BuildOutflow process
Then Rise a BuildOutflow Request with  Seventh RPM User 2707 with "06-18-2020"
Then logout  seventh RPM User after rise a full BuildOutflow process

@NOCuser7
Scenario: Check the status of the BuildOutflow apllication for with seventh NOC User

When seventh NOC User login with valid creditinals for full BuildOutflow process
Then check the "Approved" status a BuildOutflow Request with  seventh NOC User 2707
Then logout  seventh NOC User after rise a full BuildOutflow process



