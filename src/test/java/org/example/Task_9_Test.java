package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task_9_Test {

    private Task_9 task9;

    @BeforeEach
    public void setup(){
        task9 = new Task_9();
    }

    @ParameterizedTest
    @MethodSource("sameLetters")
    public void should_return_true(String firstWord, String secondWord) {
        assertTrue(task9.checkWords(firstWord, secondWord));
    }

    @ParameterizedTest
    @MethodSource("differentLetters")
    public void should_return_false(String firstWord, String secondWord) {
        assertFalse(task9.checkWords(firstWord, secondWord));
    }

    private static Stream<Arguments> sameLetters() {
        return Stream.of(
                Arguments.of("ab", "ba"),
                Arguments.of("Peter", "teerP"),
                Arguments.of("alaMaKota", "MaalaKota"),
                Arguments.of("tama", "mata"),
                Arguments.of("mara", "rama"),
                Arguments.of("qwerty", "ytrewq"),
                Arguments.of("", "")
        );
    }

    private static Stream<Arguments> differentLetters() {
        return Stream.of(
                Arguments.of("a", ""),
                Arguments.of("", "b"),
                Arguments.of("ala", "ola"),
                Arguments.of("12", "a"),
                Arguments.of("A", "a"),
                Arguments.of("QWERTY", "qwerty"),
                Arguments.of("yyl", "YYl"),
                Arguments.of(null, "YYl"),
                Arguments.of(null, null)

        );
    }

}
