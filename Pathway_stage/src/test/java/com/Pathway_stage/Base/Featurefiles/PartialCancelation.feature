Feature: check the all functions of Partial Cancelation flow for all users

@Marketuser1
Scenario: Rise a Partial Cancelation Request with first Market User
Given enter url application into "chrome" for Partial cancelation flow with "stage"
When first Market User login with valid creditinals for Partial cancelation process with "stage" 
Then Rise a Partial Cancelation Request with first Market User 2718
Then logout first MarketUser after rise a Partial cancelation process

@RPMuser1
Scenario: Check the status of the  Partial Cancelation application with first RPM User

When first RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a  Partial Cancelation Request with first RPM User 2718
Then logout First RPM User after rise a Partial cancelation process

@NOCuser1
Scenario: Check the status of the Partial Cancelation application  with First NOC User

When first NOC User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with first NOC User 2718
Then logout First NOC User after rise a Partial cancelation process

@LegalUser1
Scenario: Check the status of the Partial cancelation application  with First Legal User

When First Legal User login with valid creditinals for Partial cancelation process
Then Request send to FCC of Partial cancelation process with  First Legal User 2718
Then logout First Legal User after rise a Partial cancelation process

@Marketuser2
Scenario: Rise a Partial Cancelation Request with second Market User

When second Market User login with valid creditinals for Partial cancelation process
Then Rise a Partial Cancelation Request with second Market User 2719
Then logout second MarketUser after rise a Partial cancelation process

@RPMuser2
Scenario: Check the status of the Partial Cancelation application  with second RPM User

When second RPM User login with valid creditinals for Partial cancelation process
Then check the "Rejected" status a Partial Cancelation Request with second RPM User 2719
Then logout second RPM User after rise a Partial cancelation process

@Marketuser3
Scenario: Rise a Partial Cancelation Request with Third Market User

When Third Market User login with valid creditinals for Partial cancelation process
Then Rise a Partial Cancelation Request with Third Market User 2720
Then logout Third MarketUser after rise a Partial cancelation process

@RPMuser3
Scenario: Check the status of the  Partial Cancelation application with Third RPM User

When Third RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with Third RPM User 2720
Then logout Third RPM User after rise a Partial cancelation process

@NOCuser3
Scenario: Check the status of the Partial Cancelation apllication  with Third NOC User

When Third NOC User login with valid creditinals for Partial cancelation process
Then check the "Rejected" status a Partial Cancelation Request with Third NOC User 2720
Then logout Third NOC User after rise a Partial cancelation process

@Marketuser4
Scenario: Rise a Partial Cancelation Request with fourth Market User

When fourth Market User login with valid creditinals for Partial cancelation process
Then Rise a Partial Cancelation Request with fourth Market User 2721
Then logout fourth MarketUser after rise a Partial cancelation process

@RPMuser4
Scenario: Check the status of the  Partial Cancelation application with fourth RPM User

When fourth RPM User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a Partial Cancelation Request with fourth RPM User 2721
Then logout fourth RPM User after rise a Partial cancelation process

@NOCuser4
Scenario: Check the status of the Partial Cancelation apllication  with fourth NOC User

When fourth NOC User login with valid creditinals for Partial cancelation process
Then check the "Approved" status a  Partial Cancelation Request with fourth NOC User 2721
Then logout fourth NOC User after rise a Partial cancelation process

@RPMUSER5
Scenario: Rise a Partial Cancelation apllication Request with fifth RPM User

When fifth RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  fifth RPM User 2722
Then logout  fifth RPM User after rise a Partial Cancelation process

@NOCuser5
Scenario: Check the status of the Partial Cancelation  with Fifth NOC User

When fifth NOC User login with valid creditinals for Partial Cancelation process
Then check the "Approved" status a Partial Cancelation Request with  fifth NOC User 2722
Then logout  fifth NOC User after rise a Partial Cancelation process

@LegalUser5
Scenario: Check the status of the Partial Cancelation apllication for with fifth Legal User

When fifth Legal User login with valid creditinals for Partial Cancelation process
Then Request send to FCC of Partial Cancelation Request with  fifth Legal User 2722
Then logout fifth Legal User after rise a Partial Cancelation process

@RPMUSER6
Scenario: Rise a Partial Cancelation Request with sixth RPM User

When sixth RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  sixth RPM User 2723
Then logout  sixth RPM User after rise a Partial Cancelation process

@NOCuser6
Scenario: Check the status of the Partial Cancelation process with sixth NOC User

When sixth NOC User login with valid creditinals for Partial Cancelation process
Then check the "Rejcted" status a Partial Cancelation Request with  sixth NOC User 2723
Then logout  sixth NOC User after rise a Partial Cancelation process

@RPMUSER7
Scenario: Rise a Partial Cancelation Request with seventh RPM User

When seventh RPM User login with valid creditinals for Partial Cancelation process
Then Rise a Partial Cancelation Request with  Seventh RPM User 2724
Then logout  seventh RPM User after rise a Partial Cancelation process

@NOCuser7
Scenario: Check the status of the Partial Cancelation apllication for with seventh NOC User

When seventh NOC User login with valid creditinals for Partial Cancelation process
Then check the "Approved" status a Partial Cancelation Request with  seventh NOC User 2724
Then logout  seventh NOC User after rise a Partial Cancelation process