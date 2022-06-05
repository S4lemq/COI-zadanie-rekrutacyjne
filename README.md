# 💻⌨️ COI-zadanie-rekrutacyjne ⌨️💻
# 1. Czym różni się obiekt od klasy?
Obiekt jest instancją klasy, klasa jest definicją jak obiekt ma być zbudowany (czyli np. klasa jest planem architektonicznym a budynek zbudowany na jego
podstawie - obiektem). Podsumowując obiekt to przedstawiciel, czyli reprezentant klasy.
# 2. Czy różni się klasa abstrakcyjna od interfejsu?
  - Klasa abstrakcyjna, podobnie jak normalna klasa, może przechowywać stan (może mieć pola) gdzie można ją modyfikować metodami nieabstrakcyjnymi.
    Interfejsy nie mogą mieć stanu, jedynie stałe.
  - Przed Javą 8 różnice były duże gdyż interfejs mógł mieć tylko deklaracje metod, gdzie klasa abstarkcyjna zarówno metody abstrakcyjne (czyli deklaracje)
    jak i metody wraz z implementacją. Natomiast w Javie 8 do interfejsów zostały dodane metody deafultowe oraz statyczne, które muszą mieć implementację, w Javie 9
    również metody prywatne.
  - Interfejs nie może mieć konstruktora, klasa abstrakcyjna może
  - Klasa abstrakcyjna jest klasą a interfejs interfejsem
  - Możemy rozszerzać tylko jedną klasę, natomiast interfejsów możemy implementować więcej niż jeden.
  - Tak jak wyżej wspomniałem wszystkie metody w interfejsach  z założenia są abstrakcyjne (oprócz default i static), podczas gdy w klasie abstrakcyjnej
    wcale takie być nie muszą.
# 3. Proszę wyjaśnić mechanizm dziedziczenia w Javie.
Jest to sposób na reużywanie już istniejącego kodu, w której nowa klasa tworzona jest na podstawie już istniejącej klasy, pobierając jej pola i metody, a także dodając nowe składniki, których nowa klasa wymaga. Istniejące metody możemy też nadpisywać -> overriding (polimorfizm dynamiczny) w klasie pochodnej
# 4. Co należy zdefiniować w klasie podrzędnej.
Wszystko co dotyczy tej klasy
# 5. W którym miejscu klasy można deklarować zmienne.
W dowolnym miejscu
# 6. Proszę omówić modyfikatory dostępu w Javie.
• private - prywatny modyfikator dostępu oznacza, że pola, metody itp. są widoczne tylko z klasy, w której się znajdują

• default (package-private) - defaultowy modyfikator dostępu określamy w ten sposób, że nie wpisujemy żadnego modyfikatora dostępu przy polu lub metodzie. Oznacza on natomiast, że pole lub metoda jest widoczna tylko dla klas znajdujących się w tej samej paczce co nasze pole lub metoda

• protected - modyfikator dostępu protected oznacza, że pola, metody itp. mogą być dostępne tylko dla klas dziedziczących z klasy, w której napisaliśmy ten modyfikator dostępu, albo z klas, które są dostępne w tej samej paczce co klasa, w której napisaliśmy słówko protected

• public - publiczny modyfikator dostępu oznacza, że pole, metoda itp. mogą być dostępne z każdego
# 7. Które ze słów kluczowych powoduje przeskoczenie z bloku try do bloku finally.
return
# 8. Mając listę String[] drzewa = {„brzoza”, „modrzew”, „grab”, „buk”, „wierzba” } proszę zaproponować wyświetlenie jej na ekranie za pomocą iteratora i za pomocą generyków. 
Rozwiązanie w pakiecie main/java/org.example/Task_8-> klasa Task_8
# 9. Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter.
Rozwiązanie w pakiecie main/java/org.example/Task_9, natomiast testy w pakiecie test/java/org.example/Task_9_Test
# 10. Proszę przedstawić wysokopoziomowy diagram systemu dostępnego przez przeglądarkę internetową, przechowującego informacje o sukcesach sportowych osób znajdujących się w systemie. Proszę zaproponować model logiczny bazy danych, oraz wysokopoziomowo komponenty systemu. Nie ma potrzeby schodzić na poziom kodu źródłowego. W sytuacji wymagającej doszczegółowienia wymagań proszę przyjąć własne założenia i opisać je.
# 13. Czy zbiór (Set) może zawierać duplikaty?  
Nie
# 14. Zaznaczyć metody należące do java.util.Set:
a) addAll

b) contains

c) size

d) remove
# 15. Napisać zapytanie zwracające ilość praconików bez przełożonych z poniższej tabeli.
SELECT COUNT(*) AS PRACOWNICY FROM ‘nazwa tabeli’ WHERE manager_id IS NULL GROUP BY manager_id;   

# 16. Z powyższej tabeli napisać zapytanie zwracające kwotę najmniejszego wynagrodzenia.
SELECT MIN(salary) AS NAJNIZSZA FROM ‘nazwa tabeli’;
# 17. Napisz fragment kodu w języku Java, który sprawdzi pełnoletność osoby. Parametrem wejściowym do obliczeń jest numer PESEL w postaci String.
Rozwiązanie w pakiecie main/java/org.example/Task_17, natomiast testy w pakiecie test/java/org.example/Task_17_Test

Dodatkowo zaimplementowałem sprawdzanie czy Pesel jest prawidłowy za pomocą źródła https://www.infor.pl/prawo/gmina/dowod-osobisty/262184,Jak-sprawdzic-czy-masz-poprawny-PESEL.html
# 18. Poniższa metoda:
```java
private static String getElement(Object list, Integer number) {
  return ((List)list).get(number).toString();
}
```
# zadziała dla poniższych danych:
```java
public static void main(String[] args) {
  List<String> list = new ArrayList<>();
  list.add("A");
  list.add("B");
  list.add("C");
```
# W jakich przypadkach (dla innych danych wejściowych) metoda getElement może spowodować błąd i jak się przed tym zabezpieczyć?
Metoda getElement w argumencie przyjmuje obiekt typu Object, jest to o tyle niebezpieczne, gdyż wszystkie klasy w Javie, nawet jeżeli nie mają jawnie podanego rodzica, bezpośrednio lub pośrednio przez swoich przodków dziedziczą po bazowej klasie Object. Dzięki temu do zmiennej referencyjnej typu Object możemy przypisać dowolny obiekt. Więc można przekazać w argumencie np String’a i wtedy wyrzuci wyjątek runtime
ClassCaseException. Można albo posłużyć się instanceof (rozwiązanie w klasie Task_18) lub w argumencie metody zmienić Object na List.
# 19. Czym różnią się poniższe zapisy i który jest preferowany oraz dlaczego:
```java
public void test(String wartosc) {
    /*1*/if (wartosc.equals(""));
    /*2*/if ("".equals(wartosc));
    /*3*/if (wartosc == "");
```
Za pomocą == sprawdzamy czy podane wartości prowadzą do tego samego miejsca w pamięci. Na przykładzie String mimo, że mogą mieć taką samą zawartość, to mogą prowadzić do różnych miejsc w pamięci w zależności, jak zostały utworzone. Gdy tworzymy za pomocą operatora new to rezerwujemy nowe miejsce w pamięci i operator == zwróci false nawet gdy podane Stringi mają taką samą wartość, zaś gdy stworzymy za pomocą literału to zwróci nam true gdyż trafi ona do String pool.
Equals() porównuje nie miejsce w pamięci, a rzeczywistą zawartość obiektu.
Do porównywania Stringów preferowana jest 2 gdyż zakładam, że “” to jakaś stała w metodzie natomiast String z argumentu metody musi zostać sprawdzony, gdyż np equals sprawdza czy obiekt nie jest nullem aby nie wystąpił wyjątek nullPointerException.
# 20. Co to są obiekty immutable? Czy final sprawia że obiekt jest immutable i dlaczego?
Obiekt immutable to taki, który po utworzeniu i inicjalizacji pozostaje niezmienny oraz nie ma możliwości jego zmiany.
Tworząc obiekt i deklarując go final nie zapewniamy, że jest immutable, czyli bez problemu możemy zmieniać jego zawartość, o ile dane pole w klasie nie jest final. Final zapewnia jedynie, aby nie została zmieniona referencja obiektu. Czyli operacja podana niżej nie wykona się:
final Test test = new Test(“a”, 2);
test = new Test(“b”, 3);
lecz jeżeli klasa udostępnia setter to zmienić jego zawartość jak najbardziej można -> czego nie można w obiektach immutable.
final Test test = new Test(“a”, 2);
test.setFiled(“b”);
# 21. Czym różni się metoda http POST od GET?
GET służy do pobierania danych z określonego zasobu np z danego endpointu.

POST służy do tworzenia określonego zasobu, np wysyłamy formatem JSON dane pod określony endpoint, które aplikacja zapisuje np w bazie danych. Musi mieć z góry określony format (czy wysyłamy JSON czy też może w Params). Może służyć do pobierania danych w przypadku kiedy musimy w ramach body dostarczać dodatkowe parametry
# 22. Jak powinna wyglądac sygnatura metody do której można przekazać dowolną ilość parametrów tego samego typu?
```java
public void example(String...args){}
```


