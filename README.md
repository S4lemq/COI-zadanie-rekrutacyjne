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
