Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario Outline: User Login In The Web Application
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page  

Examples:

|Username|Password|
|AAA|123|
|BBB|456|
|William1234|User@123|

@sanityTest
Scenario: User Search And Select The Room And Details In The Select Hotel Page
     When user Select The Location
     And user Select The Hotel
     And user Select The Room Type
     And user Select The Number Of Rooms
     And user Select The Check In Date
     And user Select The Check Out Date
     And user Select The Adults Per Room
     And user Select The Children Per Room
     Then user Click The Search Button It Navigates To The Select Hotel Page
     
@sanityTest
Scenario: User Confirm The Room In Search Hotel Page
     When user Click The Select Button
     Then user Click The Continue Button It Navigates To The Book A Hotel App
     
@sanityTest
Scenario: User Book The Room And Payment Details In Search Hotel Page
     When user Enter The Valid First Name
     And user Enter The Valid Last Name
     And user Enter The Billing Address
     And user Enter The Valid Credit Card Number
     And user Choose The Credit Card Type 
     And user Select The Select Month In The Expiry Date Box
     And user Select The Select Year In The Expiry Date Box
     And user Enter The CVV Number
     Then User Click The Book Now Button It Navigates To The Booking Configuration Page
     
     
@regressionTest
Scenario: User LogOut In The My Itinerary Page
     Then user Click The LogOut Button