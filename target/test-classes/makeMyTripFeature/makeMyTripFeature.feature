@validRoundtrip
Feature: make my trip flight ticket booking

Background:
Given openbrowser as "chrome"
When loadurl as "https://www.makemytrip.com/flights"

Scenario: validate the roundtrip from chennai to delhi flight ticket booking
When click roundtrip
When enter and select from city as "chennai"
When enter and select to city as "delhi"
When select departure date as "Fri Jan 20 2023"
And select return date as "Fri Feb 03 2023"
When click the search button
When close the popup module
And select the lowest price return flight
When click the booknow button
And click the conform button