Feature: Create KYC Individual Cryptoadvisory
  Background:
    Given user logged in Cryptoadvisory

  @CreateKYCIndividualCryptoadvisory
  Scenario Outline: Create KYC successfully Cryptoadvisory
    When user create KYC Cryptoadvisory with "<identificationNum>" and "<dateOfBirth>" and "<placeOfBirth>" and "<residentialAddress>" and "<city>" and "<postalCode>" as credentials
    Then Cryptoadvisory show submission header
    And Restore KYC
    Examples:
      | identificationNum | dateOfBirth | placeOfBirth  | residentialAddress |city         | postalCode |
      | 123456789         | 01.01.1991  |data test      | data test          | data test   | 7000    |
