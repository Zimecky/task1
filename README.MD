Zadanie 2
TEST API
Korzystając z API Narodowego Banku Polskiego (http://api.nbp.pl/) napisz program, z założeniami:
1. Pobrać aktualne średnie kursy walut z tabeli A (http://api.nbp.pl/api/exchangerates/tables/A) w
   formacie JSON,
2. Wysłać tylko jedno zapytanie do API NBP podczas działania całego testu,
3. Wyświetlać kody odpowiedzi z API,
4. Napisz poniższy scenariusz Cucumber z wykorzystaniem RestAssured. Wartości pogrubione powinny
   być parametrami jakie użytkownik może zmieniać,


Scenariusz cucumber: <br>
Scenario: Kursy walut <br>
• Pobierz kursy walut <br>
• Wyświetl kurs dla waluty o kodzie: USD <br>
• Wyświetl kurs dla waluty o nazwie: dolar amerykański <br>
• Wyświetl waluty o kursie powyżej: 5 <br>
• Wyświetl waluty o kursie poniżej: 3