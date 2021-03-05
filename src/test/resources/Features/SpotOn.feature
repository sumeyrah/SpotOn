Feature: Automate the basic flow of

  #Adopt Brooke, add a Chewy Toy and a Travel Carrier, pay with Check
  @s1
  Scenario: Verify that client adopt Brook with Chew Toy and Travel Carrier, and pay with check
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Brook"
    Then Client wants to add "Chew Toy"
    Then Client wants to add "Travel Carrier"
    And Client wants to complete adoption
    And Client wants to enter information
      |Name|Sumeyra|
      |Addres|1314 Choctaw|
      |email |email@gmail.com|
    And client wants to pay with "check"
    And Client wants to place order
    And  client should be able  to see message as "Thank you for adopting a puppy!"

#Adopt Sparky, add a Collar & Leash, pay with Credit Card
  @s2
  Scenario: Verify that client adopt Sparky with Collar & Leash, and pay with Credit Card
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Sparky"
    Then Client wants to add "Collar & Leash"
    And Client wants to complete adoption
    And Client wants to enter information
      |Name|Sumeyra|
      |Addres|1314 Choctaw|
      |email |email@gmail.com|
    And client wants to pay with "Credit Card"
    And Client wants to place order
    And client should be able  to see message as "Thank you for adopting a puppy!"


    #Adopt 2 Random Dogs add a Collar & Leash to each, pay with Credit Card
  @s3
  Scenario: Verify that client adopt a random dog with Collar & Leash, and pay with Credit Card
    Given Client wants to go to Puppy Adoption Agency
    Then Client wants to adopt "Random dog"
    Then Client wants to add "Collar & Leash"
    And Client wants to complete adoption
    And Client wants to enter information
      |Name|Sumeyra|
      |Addres|1314 Choctaw|
      |email |email@gmail.com|
    And client wants to pay with "Credit Card"
    And Client wants to place order
    And client should be able  to see message as "Thank you for adopting a puppy!"



    #Adopt 2 Random Dogs add a 3 Random Accessories to 1, pay with Credit Card
  @s4 @smoke
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
      |Addres|1314 Choctaw|
      |email |email@gmail.com|
    And client wants to pay with "Credit Card"
    And Client wants to place order
    And client should be able  to see message as "Thank you for adopting a puppy!"