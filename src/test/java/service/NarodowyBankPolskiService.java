package service;

import io.restassured.http.ContentType;
import model.ExchangeCurrencyRateResponse;

import static io.restassured.RestAssured.given;

public class NarodowyBankPolskiService {

    private ExchangeCurrencyRateResponse[] exchangeCurrencyRateResponse;
    private final static String API_NBP_URL = "https://api.nbp.pl/api/exchangerates/tables/A";

    public void getCurrencyRates(){
        exchangeCurrencyRateResponse = given()
                .contentType(ContentType.JSON)
                .get(API_NBP_URL)
                .then()
                .log().status()
                .extract().body().as(ExchangeCurrencyRateResponse[].class);
    }

    public void displayExchangeRateForCurrencyCode(String currencyCode) {
        for (int i = 0; i < exchangeCurrencyRateResponse[0].getRates().size(); i++) {
            if (exchangeCurrencyRateResponse[0].getRates().get(i).code.equals(currencyCode)) {
                System.out.println(exchangeCurrencyRateResponse[0].getRates().get(i).mid);
            }
        }
    }

    public void displayExchangeRateForCurrencyWithName(String currencyName) {
        for (int i = 0; i < exchangeCurrencyRateResponse[0].getRates().size(); i++) {
            if (exchangeCurrencyRateResponse[0].getRates().get(i).currency.equals(currencyName)) {
                System.out.println(exchangeCurrencyRateResponse[0].getRates().get(i).mid);
            }
        }
    }

    public void displayCurrenciesWithRatesAbove(int midCurrencyValue) {
        for (int i = 0; i < exchangeCurrencyRateResponse[0].getRates().size(); i++) {
            if (exchangeCurrencyRateResponse[0].getRates().get(i).mid > midCurrencyValue) {
                System.out.println(exchangeCurrencyRateResponse[0].getRates().get(i).currency);
            }
        }
    }

    public void displayCurrenciesWithRatesBelow(int midCurrencyValue) {
        for (int i = 0; i < exchangeCurrencyRateResponse[0].getRates().size(); i++) {
            if (exchangeCurrencyRateResponse[0].getRates().get(i).mid < midCurrencyValue) {
                System.out.println(exchangeCurrencyRateResponse[0].getRates().get(i).currency);
            }
        }
    }
}
