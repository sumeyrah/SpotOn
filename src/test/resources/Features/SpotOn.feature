Feature: Automate the basic flow of

  #Adopt Brooke, add a Chewy Toy and a Travel Carrier, pay with Check
  @s1  @regression
  Scenario: Verify that client adopt Brook with Chew Toy and Travel Carrier, and pay with check
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Brook"
    Then Client wants to add "Chew Toy"
    Then Client wants to add "Travel Carrier"
    And Client wants to complete adoption
    And Client wants to enter information
      |Name   |Sumeyra         |
      |Address|1314 Choctaw    |
      |email  |email@gmail.com |
    And client wants to pay with "Check"
    And Client wants to place order
    And  client should be able  to see message as "Thank you for adopting a puppy!"


#Adopt Sparky, add a Collar & Leash, pay with Credit Card
  @s2 @regression
  Scenario: Verify that client adopt Sparky with Collar & Leash, and pay with Credit Card
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Sparky"
    Then Client wants to add "Collar & Leash"
    And Client wants to complete adoption
    And Client wants to enter information
      |Name   |Sumeyra         |
      |Address|1314 Choctaw    |
      |email  |email@gmail.com |
    And client wants to pay with "Credit card"
    And Client wants to place order
    And client should be able  to see message as "Thank you for adopting a puppy!"


    #Adopt 2 Random Dogs add a Collar & Leash to each, pay with Credit Card
  @s3  @regression
  Scenario: Verify that client adopt a random dog with Collar & Leash, and pay with Credit Card
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Random dog"
    Then Client wants to add "Collar & Leash"
    And Client wants to complete adoption
    And Client wants to enter information
      |Name   |Sumeyra         |
      |Address|1314 Choctaw    |
      |email  |email@gmail.com |
    And client wants to pay with "Credit card"
    And Client wants to place order
    And client should be able  to see message as "Thank you for adopting a puppy!"



    #Adopt 2 Random Dogs add a 3 Random Accessories to 1, pay with Credit Card
  @s4 @regression
  Scenario: Verify that client adopt a random dog with Collar & Leash, and pay with Credit Card
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Random dog"
    And  Client wants to adapt another puppy
    Then Client wants to adopt "Random dog 2"
    Then Client wants to add "Random Accessories"
    Then Client wants to add "Random Accessories 2"
    Then Client wants to add "Random Accessories 3"
    And  Client wants to complete adoption
    And  Client wants to enter information
      |Name|Sumeyra|
      |Address|1314 Choctaw|
      |email |email@gmail.com|
    And client wants to pay with "Credit card"
    And Client wants to place order
    And client should be able  to see message as "Thank you for adopting a puppy!"



    # Bug 1
    # Accessories, When you add it any accessories
    # it is multiple with two in the total amount of money


    # Bug 2
    # Search Field is not working as expected.
    # Search filed is accepting any tex but it does not searching, the functinlity
    # is not working as expected

   # Bug 3
   # Learn, Animal shelters, Classifieds, Message Boards and Pet News page are not reaching.
















