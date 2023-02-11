@validAddToCartAndRemove
Feature: validate the checkout page with all data set

Background:
Given open browser as "chrome"
When enter url as "https://www.flipkart.com/"

Scenario: validate the checkout page with valid data
When close the login module
When search product as "mobile"
Then validate list page as "Mobiles"
When get the first product name
And get the first product price
And click the first product
When get the detail page product name match with list page product name
And get the detail page product price and match with list page product price
And click add to cart button
When get the product name of the cart product and match with the detail page product name
And get the product price of the cart product and match with the detail page product price
And click cart remove button
When click remove in Remove Item module
Then validate the product is removed as "Missing Cart items?"