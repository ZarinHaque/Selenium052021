Feature: user want to visit amazon webpage & verify search

in order to verify search 
as a register user 
I want to visit amazon web page & write a text in search box then search


Scenario Outline:

Given user visits amazon home page
When user search by "<productname>"
Then user click on search button
Then verify the page



Examples:

| productname |
| iphone 12 pro max   |

