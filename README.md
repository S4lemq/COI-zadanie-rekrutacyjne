# COI-zadanie-rekrutacyjne
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
# 4. Co należy zdefiniować w klasie podrzędnej
Wszystko co dotyczy tej klasy
# 5. W którym miejscu klasy można deklarować zmienne
W dowolnym miejscu
# 6. Proszę omówić modyfikatory dostępu w Javie.
• private - prywatny modyfikator dostępu oznacza, że pola, metody itp. są widoczne tylko z klasy, w której się znajdują
• default (package-private) - defaultowy modyfikator dostępu określamy w ten sposób, że nie wpisujemy żadnego modyfikatora dostępu przy polu lub metodzie. Oznacza on natomiast, że pole lub metoda jest widoczna tylko dla klas znajdujących się w tej samej paczce co nasze pole lub metoda
• protected - modyfikator dostępu protected oznacza, że pola, metody itp. mogą być dostępne tylko dla klas dziedziczących z klasy, w której napisaliśmy ten modyfikator dostępu, albo z klas, które są dostępne w tej samej paczce co klasa, w której napisaliśmy słówko protected
• public - publiczny modyfikator dostępu oznacza, że pole, metoda itp. mogą być dostępne z każdego
# 7. Które ze słów kluczowych powoduje przeskoczenie z bloku try do bloku finally
return
# 8. Mając listę String[] drzewa = {„brzoza”, „modrzew”, „grab”, „buk”, „wierzba” } proszę zaproponować wyświetlenie jej na ekranie za pomocą iteratora i za pomocą generyków. 
Zadanie w projekcie -> klasa Task_8
# 9. Proszę zaproponować kod źródłowy metody weryfikującej czy podane 2 wyrazy składają się z tych samych liter np.
MARA – składa się z 1 litery M, 2 liter A, 1 litery R
RAMA – składa się z 1 litery R, 2 liter A, 1 litery M
Podane przykłady składają się z tych samych liter.
Napisać podstawowe testy jednostkowe dla tej metody (jUnit).
Rozwiązanie w pakiecie main/java/Task_9, natomiast testy w pakiecie test

