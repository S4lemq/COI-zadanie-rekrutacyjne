package org.example;

import org.example.enums.PeselMessageEnum;
import org.example.exceptions.InvalidLengthException;
import org.example.exceptions.InvalidPeselException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Task_17_Test {

    private Task_17 task17;

    @BeforeEach
    public void setup(){
        task17 = new Task_17();
    }

    @ParameterizedTest
    @MethodSource("adult")
    public void should_return_true(String pesel) {
        assertTrue(task17.checkLegalAge(pesel));
    }

    @ParameterizedTest
    @MethodSource("underAge")
    public void should_return_false(String pesel) {
        assertFalse(task17.checkLegalAge(pesel));
    }

    @Test
    public void should_throw_exception_when_pesel_length_in_too_short(){
        //given
        String pesel = "1234";
        //when
        InvalidLengthException result = assertThrows(InvalidLengthException.class,
                () -> task17.checkLegalAge(pesel));

        //then
        assertEquals(PeselMessageEnum.WRONG_LENGTH.getMessage(), result.getMessage());
    }

    @Test
    public void should_throw_exception_when_pesel_length_in_too_long(){
        //given
        String pesel = "123456789101112131415";
        //when
        InvalidLengthException result = assertThrows(InvalidLengthException.class,
                () -> task17.checkLegalAge(pesel));

        //then
        assertEquals(PeselMessageEnum.WRONG_LENGTH.getMessage(), result.getMessage());
    }

    @Test
    public void should_throw_exception_when_pesel_is_invalid(){
        //given
        String pesel = "98072812345";
        //when
        InvalidPeselException result = assertThrows(InvalidPeselException.class,
                () -> task17.checkLegalAge(pesel));

        //then
        assertEquals(PeselMessageEnum.INVALID_PESEL.getMessage(), result.getMessage());
    }

    private static Stream<Arguments> adult() {
        return Stream.of(
                Arguments.of("96050857877"),
                Arguments.of("73070564817"),
                Arguments.of("00310363576"),
                Arguments.of("51090884616"),
                Arguments.of("95032119792"),
                Arguments.of("89022661662"),
                Arguments.of("47051839768"),
                Arguments.of("03240112799")
        );
    }

    private static Stream<Arguments> underAge() {
        return Stream.of(
                Arguments.of("05242423284"),
                Arguments.of("04310642691"),
                Arguments.of("06221856877"),
                Arguments.of("05310886193")
        );
    }
}
