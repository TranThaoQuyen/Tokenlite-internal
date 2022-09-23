Feature: Create KYB Calidris
  Background:
    Given logged in Calidris

  @CreateKYBCalidris
  Scenario Outline: Create KYC Calidris successfully
    When user create KYB Calidris with "<companyName>" and "<companyRegisterNumber>" and "<placeOfCommercialRegister>" and "<companyShareCapital>" and "<companyPlace>"  and "<companyAddress>" and "<companyPostalCode>" and "<companyCountry>" and "<incomeOfTheCompany>" and "<descriptionRegister>" and "<investmentPurpose>" and "<token>" and "<receivingWalletAddress>" as credentials
    Then Calidris show Thank you for your Submission
    And Restore KYB Calidris
    Examples:
      |companyName| companyRegisterNumber | placeOfCommercialRegister  | companyShareCapital |companyPlace         | companyAddress | companyPostalCode|companyCountry| incomeOfTheCompany   |incomeOfTheCompany   |descriptionRegister|investmentPurpose |token    |receivingWalletAddress|
      |datatestdatatest|45345354345677|datatestdatatest|datatestdatatest|datatestdatatest|datatestdatatest|7000|datatestdatatest|datatestdatatest|datatestdatatest|datatestdatatest|datatestdatatest|10|datatestdatatest|
