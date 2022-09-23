Feature: Create KYB Cryptoadvisory
  Background:
    Given logged in Cryptoadvisory

  @CreateKYBCryptoadvisory
  Scenario Outline: Create KYB Cryptoadvisory successfully
    When user create KYB Cryptoadvisory with "<companyName>" and "<registerNumber>" and "<placeOfCommercialRegister>" and "<companyShareCapital>" and "<companyPlace>"  and "<companyAddress>" and "<companyPostalCode>" as credentials
    Then Cryptoadvisory show Thank you for your Submission
    And Restore KYB
    Examples:
      | companyName | registerNumber | placeOfCommercialRegister  | companyShareCapital |companyPlace         | companyAddress | companyPostalCode|
      | data test   | 4534535435435  | data test                  | data test           | data test           | data test       |   7000           |
