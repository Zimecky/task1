package steps;

import io.cucumber.java.en.Given;
import service.NarodowyBankPolskiService;


public class ExchangeCurrencyRateSteps {
    NarodowyBankPolskiService narodowyBankPolskiService = new NarodowyBankPolskiService();

    @Given("Get currency rates")
    public void getCurrencyRates() {
        narodowyBankPolskiService.getCurrencyRates();
    }

    @Given("Display exchange for currency code {string}")
    public void displayExchangeRateForCurrencyCode(String currencyCode) {
        narodowyBankPolskiService.displayExchangeRateForCurrencyCode(currencyCode);
    }

    @Given("Display exchange rate for currency with name {string}")
    public void displayExchangeRateForCurrencyWithName(String currencyName) {
        narodowyBankPolskiService.displayExchangeRateForCurrencyWithName(currencyName);
    }

    @Given("Display currencies with rates above {int}")
    public void displayCurrenciesWithRatesAbove(int midCurrencyValue) {
        narodowyBankPolskiService.displayCurrenciesWithRatesAbove(midCurrencyValue);
    }

    @Given("Display currencies with rates below {int}")
    public void displayCurrenciesWithRatesBelow(int midCurrencyValue) {
        narodowyBankPolskiService.displayCurrenciesWithRatesBelow(midCurrencyValue);
    }
}
