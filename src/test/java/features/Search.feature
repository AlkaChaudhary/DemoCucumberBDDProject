Feature: Search of various product category should be possible along with product search
@All @regression @books
Scenario: User should be able to search for products under books category
Given I visit website as a guest user
When I select books option from the dropDown
And I click on search option
Then I should see Amazon BookStore heading
But I should not see other category prducts

@All @smoke @electronics
Scenario: User should be able to search for products under books category

Given I visit website as a guest user
When I select Electronics option from the dropDown
And I click on search option
Then I should see  Electronics store heading
But I should not see other category prducts