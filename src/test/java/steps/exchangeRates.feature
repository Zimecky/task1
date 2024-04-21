Feature: Exchange currency rates

  Scenario: Exchange currency rates
    Given Get currency rates
    Given Display exchange for currency code "USD"
    Given Display exchange rate for currency with name "dolar amerykański"
    Given Display currencies with rates above 5
    Given Display currencies with rates below 3
